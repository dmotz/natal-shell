(ns
 natal-shell.toast-android
 "This namespace is automatically generated from the React Native docs.")
(clojure.core/defmacro
 show
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.show)
   (clojure.core/list 'js/React.ToastAndroid)
   args)))
(clojure.core/defmacro
 short
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.-SHORT)
   (clojure.core/list 'js/React.ToastAndroid)
   args)))
(clojure.core/defmacro
 long
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.-LONG)
   (clojure.core/list 'js/React.ToastAndroid)
   args)))
