(ns natal-shell.core
  (:require [natal-shell.components :refer [view text]]))

(defmacro with-error-view [& body]
  `(try
    ~@body
    (catch
      :default e#
      (view
        {:style
         {:backgroundColor "#cc0814" :flex 1 :padding 20 :paddingTop 40}}

        (text
          {:style
           {:fontWeight "normal" :color "white" :fontSize 24 :marginBottom 10}}
          "ERROR")

        (text
          {:style
           {:color "white" :fontFamily "Menlo-Regular" :fontSize 16 :lineHeight 24}}
          (.-message e#))

        (text
          {:style
           {:color "white" :marginTop 20 :fontSize 16 :fontWeight "bold"}}
          "Check REPL log for details.")))))
