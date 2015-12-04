(ns
 natal-shell.async-storage
 "This namespace is automatically generated from the React Native docs.")
(clojure.core/defmacro
 get-item
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.getItem)
   (clojure.core/list 'js/React.AsyncStorage)
   args)))
(clojure.core/defmacro
 set-item
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.setItem)
   (clojure.core/list 'js/React.AsyncStorage)
   args)))
(clojure.core/defmacro
 remove-item
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.removeItem)
   (clojure.core/list 'js/React.AsyncStorage)
   args)))
(clojure.core/defmacro
 merge-item
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.mergeItem)
   (clojure.core/list 'js/React.AsyncStorage)
   args)))
(clojure.core/defmacro
 clear
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.clear)
   (clojure.core/list 'js/React.AsyncStorage)
   args)))
(clojure.core/defmacro
 get-all-keys
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.getAllKeys)
   (clojure.core/list 'js/React.AsyncStorage)
   args)))
(clojure.core/defmacro
 flush-get-requests
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.flushGetRequests)
   (clojure.core/list 'js/React.AsyncStorage)
   args)))
(clojure.core/defmacro
 multi-get
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.multiGet)
   (clojure.core/list 'js/React.AsyncStorage)
   args)))
(clojure.core/defmacro
 multi-set
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.multiSet)
   (clojure.core/list 'js/React.AsyncStorage)
   args)))
(clojure.core/defmacro
 multi-remove
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.multiRemove)
   (clojure.core/list 'js/React.AsyncStorage)
   args)))
(clojure.core/defmacro
 multi-merge
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.multiMerge)
   (clojure.core/list 'js/React.AsyncStorage)
   args)))
