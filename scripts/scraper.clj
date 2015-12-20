(ns natal-shell.scraper
  (:require
    [clojure.core.async :refer [go <!!]]
    [natal-shell.utils :refer [to-kebab to-snake]]
    [clojure.pprint :refer [pprint]]
    [clojure.java.io :as io]
    [net.cgrand.enlive-html :refer [html-resource select nth-child]]))


(def ns-prefix "natal-shell.")
(def base-url  "http://facebook.github.io")
(def entry-url "/react-native/docs/getting-started.html")
(def base-path "src/natal_shell/")
(def comp-file "components_list")


(defn select-doc-section [n]
  [[:.nav-docs-section (nth-child n)] :a])


(defn select-name [tag]
  (->> tag :content first :content (some #(when (string? %) %))))


(defn fetch! [url]
  (go
    (html-resource (java.net.URL. (str base-url url)))))


(defn fetch-comps! [page]
  (go
    (->> (select page (select-doc-section 5))
      (map #(fetch! (get-in % [:attrs :href])))
      doall
      (map <!!)
      (map #(select % [:h1]))
      (map #(-> % first :content first str)))))


(defn fetch-apis! [page]
  (go
    (->> (select page (select-doc-section 6))
      (map #(fetch! (get-in % [:attrs :href])))
      doall
      (map <!!)
      (map
        (fn [page]
          (let [prop-sections (select page [:.props])]
            [(-> (select page [:h1]) first :content first)
             {:methods    (map select-name (select (first prop-sections) [:.prop]))
              :properties (map select-name (select (second prop-sections) [:.prop]))}]))))))


(defn make-ns [name]
  `(~'ns ~(symbol (str ns-prefix name))
    "This namespace is automatically generated from the React Native docs."))


(defn method-macro [react-ns js-name]
  `(defmacro ~(symbol (to-kebab js-name)) [& ~'args]
     `(~'~(symbol (str "." js-name))
       ~'~(symbol (str "js/React." react-ns))
       ~@~'args)))


(defn property-macro [react-ns js-name]
  `(defmacro ~(symbol (to-kebab js-name)) []
     `(~'~(symbol (str ".-" js-name))
        ~'~(symbol (str "js/React." react-ns)))))


(defn make-writer [path]
  (io/writer (io/file (str base-path path ".clj"))))


(defn init []
  (let [entry-page (<!! (fetch! entry-url))]
    (go
      (with-open [w (make-writer comp-file)]
        (binding [*out* w]
          (pprint (make-ns "components-list"))
          (pprint `(def ~'components ~(vec (<!! (fetch-comps! entry-page))))))))

    (doseq [[k {:keys [methods properties]}] (<!! (fetch-apis! entry-page))]
      (go
        (with-open [w (make-writer (to-snake k))]
          (binding [*out* w]
            (pprint (make-ns (to-kebab k)))
            (doseq [m methods]
              (pprint (method-macro k m)))
            (doseq [p properties]
              (pprint (property-macro k p)))))))))

(init)
