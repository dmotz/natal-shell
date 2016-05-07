(ns
 natal-shell.vibration
 "This namespace is automatically generated from the React Native docs.")
(clojure.core/defmacro
 vibrate
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.vibrate)
   (clojure.core/list 'js/ReactNative.Vibration)
   args)))
(clojure.core/defmacro
 cancel
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.cancel)
   (clojure.core/list 'js/ReactNative.Vibration)
   args)))
