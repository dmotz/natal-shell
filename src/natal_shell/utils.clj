(ns natal-shell.utils
  (:require [clojure.string :as str]))

(def camel-rx #"([a-z])([A-Z])")

(defn to-kebab [s]
  (str/lower-case (str/replace s camel-rx "$1-$2")))

(defn to-snake [s]
  (str/lower-case (str/replace s camel-rx "$1_$2")))
