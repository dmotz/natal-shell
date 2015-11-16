(ns natal-shell.components
  (:require
    [natal-shell.components-list :refer [components]]
    [natal-shell.utils :refer [to-kebab]]))


(defn wrap-component [js-name]
  `(defmacro ~(symbol (to-kebab js-name)) [props# & children#]
    `(js/React.createElement
      ~'~(symbol (str "js/React." js-name))
      (cljs.core/clj->js ~props#)
      ~@children#)))


(defmacro wrap-all []
  `(do ~@(map wrap-component components)))


(wrap-all)
