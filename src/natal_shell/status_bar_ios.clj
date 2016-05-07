(ns
 natal-shell.status-bar-ios
 "This namespace is automatically generated from the React Native docs.")
(clojure.core/defmacro
 set-style
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.setStyle)
   (clojure.core/list 'js/ReactNative.StatusBarIOS)
   args)))
(clojure.core/defmacro
 set-hidden
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.setHidden)
   (clojure.core/list 'js/ReactNative.StatusBarIOS)
   args)))
(clojure.core/defmacro
 set-network-activity-indicator-visible
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.setNetworkActivityIndicatorVisible)
   (clojure.core/list 'js/ReactNative.StatusBarIOS)
   args)))
