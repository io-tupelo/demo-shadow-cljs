(ns acme.frontend.app)
(js/console.log "#app02")

(enable-console-print!)


; these are not called for the initial load, only subsequent loads
(defn ^:dev/before-load before []
  (println :before-load)
  ) ; same as (println ...)
(defn ^:dev/after-load after []
  (println :after-all)
  ) ; same as (js/console.log ...)

(defn ^:export init [] ; shadow will call upon initial load only
  (js/console.log "init - enter again")
  (println "Hello World")
  (js/console.log "init - leave")
  )

(js/console.log "#app12"  )
; (init)
(js/console.log "#app14")


