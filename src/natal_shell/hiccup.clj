(ns natal-shell.hiccup
  (:require [clojure.string :refer [capitalize]]
            [sablono.compiler :refer [compile-html]]))


; fix later
(defn to-camel [s]
  (capitalize s))


(defn modify-tree [xs x]
  (conj
    xs
    (if (seq? x)
      (apply list (reduce modify-tree [] x))
      (if (= 'js/React.createElement (last xs))
        (symbol (str "js/React." (to-camel x)))
        x))))


(defmacro hiccup [content]
  (apply list (reduce modify-tree [] (compile-html content))))
