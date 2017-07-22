(defproject natal-shell "0.5.0"
  :description "A thin ClojureScript wrapper around the React Native API"
  :url "https://github.com/dmotz/natal-shell/"
  :license {:name "The MIT License (MIT)"
            :url "http://opensource.org/licenses/mit-license.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]

  :profiles {:dev
             {:dependencies [[org.clojure/core.async "0.2.385"]
                             [enlive "1.1.6"]]}})
