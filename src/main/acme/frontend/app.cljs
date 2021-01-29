(ns acme.frontend.app)
(js/console.log "#app02")

(enable-console-print!)

(defn ^:export init []
  (js/console.log "init - enter")
  (println "Hello World")
  (js/console.log "init - leave")
  "Hello Again"
  )

(js/console.log "#app12")
(init)
(js/console.log "#app14")
