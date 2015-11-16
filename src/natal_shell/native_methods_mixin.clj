(ns
 natal-shell.native-methods-mixin
 "This namespace is automatically generated from the React Native docs.")
(clojure.core/defmacro
 measure
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.measure)
   (clojure.core/list 'js/React.NativeMethodsMixin)
   args)))
(clojure.core/defmacro
 measure-layout
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.measureLayout)
   (clojure.core/list 'js/React.NativeMethodsMixin)
   args)))
(clojure.core/defmacro
 set-native-props
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.setNativeProps)
   (clojure.core/list 'js/React.NativeMethodsMixin)
   args)))
(clojure.core/defmacro
 focus
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.focus)
   (clojure.core/list 'js/React.NativeMethodsMixin)
   args)))
(clojure.core/defmacro
 blur
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.blur)
   (clojure.core/list 'js/React.NativeMethodsMixin)
   args)))
