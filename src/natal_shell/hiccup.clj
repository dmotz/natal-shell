(ns natal-shell.hiccup
  (:require [clojure.string :refer [capitalize]]
            [sablono.compiler :refer [compile-html]]))


; fix later
(defn to-camel [s]
  (capitalize s))


(defn modify-tree [xs x]
  (if (seq? x)
    (conj xs (apply list (reduce modify-tree [] x)))
    (if (= 'js/React.createElement (last xs))
      (conj xs (symbol (str "js/React." (to-camel x))))
      (conj xs x))))


(defmacro hiccup [content]
  (apply list (reduce modify-tree [] (compile-html content))))
