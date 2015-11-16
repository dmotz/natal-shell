(ns
 natal-shell.app-state-ios
 "This namespace is automatically generated from the React Native docs.")
(clojure.core/defmacro
 add-event-listener
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.addEventListener)
   (clojure.core/list 'js/React.AppStateIOS)
   args)))
(clojure.core/defmacro
 remove-event-listener
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.removeEventListener)
   (clojure.core/list 'js/React.AppStateIOS)
   args)))
(clojure.core/defmacro
 current-state
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.-currentState)
   (clojure.core/list 'js/React.AppStateIOS)
   args)))
