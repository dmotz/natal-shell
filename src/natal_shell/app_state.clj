(ns
 natal-shell.app-state
 "This namespace is automatically generated from the React Native docs.")
(clojure.core/defmacro
 app-state
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list 'js/ReactNative.AppState.)
   args)))
(clojure.core/defmacro
 add-event-listener
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.addEventListener)
   (clojure.core/list 'js/ReactNative.AppState)
   args)))
(clojure.core/defmacro
 remove-event-listener
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.removeEventListener)
   (clojure.core/list 'js/ReactNative.AppState)
   args)))
