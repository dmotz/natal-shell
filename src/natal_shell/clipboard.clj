(ns
 natal-shell.clipboard
 "This namespace is automatically generated from the React Native docs.")
(clojure.core/defmacro
 get-string
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.getString)
   (clojure.core/list 'js/React.Clipboard)
   args)))
(clojure.core/defmacro
 set-string
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.setString)
   (clojure.core/list 'js/React.Clipboard)
   args)))
