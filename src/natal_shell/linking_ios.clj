(ns
 natal-shell.linking-ios
 "This namespace is automatically generated from the React Native docs.")
(clojure.core/defmacro
 add-event-listener
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.addEventListener)
   (clojure.core/list 'js/React.LinkingIOS)
   args)))
(clojure.core/defmacro
 remove-event-listener
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.removeEventListener)
   (clojure.core/list 'js/React.LinkingIOS)
   args)))
(clojure.core/defmacro
 open-url
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.openURL)
   (clojure.core/list 'js/React.LinkingIOS)
   args)))
(clojure.core/defmacro
 can-open-url
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.canOpenURL)
   (clojure.core/list 'js/React.LinkingIOS)
   args)))
(clojure.core/defmacro
 pop-initial-url
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.popInitialURL)
   (clojure.core/list 'js/React.LinkingIOS)
   args)))
