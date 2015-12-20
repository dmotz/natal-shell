(ns natal-shell.data-source)

(defmacro data-source [config]
  `(js/React.ListView.DataSource. (cljs.core/clj->js ~config)))
