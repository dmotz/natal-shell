(ns natal-shell.utils
  (:require [clojure.string :as str]))

(def camel-rx #"([a-z])([A-Z])")

(defn to-kebab [s]
  (-> s
    (str/replace camel-rx "$1-$2")
    (str/replace "." "-")
    str/lower-case))

(defn to-snake [s]
  (str/lower-case (str/replace s camel-rx "$1_$2")))
