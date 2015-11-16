(ns
 natal-shell.net-info
 "This namespace is automatically generated from the React Native docs.")
(clojure.core/defmacro
 add-event-listener
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.addEventListener)
   (clojure.core/list 'js/React.NetInfo)
   args)))
(clojure.core/defmacro
 remove-event-listener
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.removeEventListener)
   (clojure.core/list 'js/React.NetInfo)
   args)))
(clojure.core/defmacro
 fetch
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.fetch)
   (clojure.core/list 'js/React.NetInfo)
   args)))
(clojure.core/defmacro
 is-connected
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.-isConnected)
   (clojure.core/list 'js/React.NetInfo)
   args)))
(clojure.core/defmacro
 is-connection-metered
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.-isConnectionMetered)
   (clojure.core/list 'js/React.NetInfo)
   args)))
