(ns acme.frontend.app)
(js/console.log "#app02")

(enable-console-print!)


; these are not called for the initial load, only subsequent loads
(defn ^:dev/before-load before [] (js/console.log :before)) ; same as (println ...)
(defn ^:dev/after-load after [] (println :after)) ; same as (js/console.log ...)

(defn ^:export init []
  (js/console.log "init - enter")
  (println "Hello World")
  (js/console.log "init - leave")
  )

(js/console.log "#app12")
(init)
(js/console.log "#app14")
