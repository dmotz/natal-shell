(ns
 natal-shell.intent-android
 "This namespace is automatically generated from the React Native docs.")
(clojure.core/defmacro
 open-url
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.openURL)
   (clojure.core/list 'js/ReactNative.IntentAndroid)
   args)))
(clojure.core/defmacro
 can-open-url
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.canOpenURL)
   (clojure.core/list 'js/ReactNative.IntentAndroid)
   args)))
(clojure.core/defmacro
 get-initial-url
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.getInitialURL)
   (clojure.core/list 'js/ReactNative.IntentAndroid)
   args)))
