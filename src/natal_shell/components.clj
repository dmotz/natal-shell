(ns natal-shell.components
  (:require
    [natal-shell.components-list :refer [components]]
    [natal-shell.utils :refer [to-kebab]]))


(defn wrap-component [js-name]
  `(defmacro ~(symbol (to-kebab js-name)) [props# & children#]
    `(js/React.createElement
      ~'~(symbol (str "js/ReactNative." js-name))
      (cljs.core/clj->js ~props#)
      ~@children#)))


(defn wrap-reagent [js-name]
  `(def ~(symbol (to-kebab js-name))
    (r/adapt-react-class (~(symbol (str ".-" js-name)) ~'js/ReactNative.))))


(defmacro wrap-all []
  `(do ~@(map wrap-component components)))


(defmacro wrap-all-reagent []
  `(do ~@(map wrap-reagent components)))


(wrap-all)
