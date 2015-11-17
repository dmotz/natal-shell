# Natal Shell
### A thin ClojureScript wrapper around the React Native API
[Dan Motzenbecker](http://oxism.com), MIT License
[@dcmotz](https://twitter.com/dcmotz)

---

Natal Shell is a simple convenience wrapper around the React Native API,
offering a simple Clojure-ready interface out of the box.

It is designed as a companion library to [Natal](https://github.com/dmotz/natal)
(a command line utility for quickly bootstrapping React Native projects in
ClojureScript), but can be used completely independently.


## Usage

Natal Shell exposes React components as macros which you can require like so:

```clojure
(ns future-app.core
  (:require [om.core :as om])
  (:require-macros [natal-shell.components :refer [view text switch-ios image slider-ios]]))
```

Use them like this:

```clojure
(text {:style {:color "teal"}} "Well isn't this nice.")
```

You can pass children as the trailing arguments, and you can even pass a collection
without the need for `apply`:

```clojure
(view
  nil
  (interleave
    (map #(text nil %) ["un" "deux" "trois"])
    (repeat (switch-ios {:style {:margin 20}})))))
```

All component names are normalized in Clojure's snake-case, for example:

```clojure
;; Using SegmentedControlIOS
(segmented-control-ios {:values ["Emerald" "Sapphire" "Gold"]})
```

The same rule applies to API methods.

APIs are divided into separate Clojure namespaces like so:

```clojure
(ns future-app.actions
  (:require-macros [natal-shell.components :refer [text]]
                   [natal-shell.alert-ios :refer [alert prompt]]
                   [natal-shell.push-notification-ios :refer [present-local-notification]]))

(text {:onPress #(alert "Hello from CLJS")} "press me")
```


## Coda

Natal Shell is automatically generated from scraping the React Native docs via
the script in `scripts/scraper.clj`.

Future areas of improvement may include optionally omitted prop arguments and
automatic conversion of snake-case keys in maps.
