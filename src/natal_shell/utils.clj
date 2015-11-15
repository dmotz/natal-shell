(ns natal-shell.utils
  (:require [clojure.string :as str]))


(defn to-kebab [s]
  (str/lower-case (str/replace s #"([a-z])([A-Z])" "$1-$2")))
