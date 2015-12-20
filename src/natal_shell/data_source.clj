(ns natal-shell.data-source)

(defmacro data-source [config]
  `(js/React.ListView.DataSource. (cljs.core/clj->js ~config)))

(defmacro clone-with-rows [ds rows]
  `(.cloneWithRows ~ds (cljs.core/clj->js ~rows)))
