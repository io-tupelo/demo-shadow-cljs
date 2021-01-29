(ns acme.frontend.app
  (:require
    [tupelo.core :as t]
    ["voca" :as voca]
    )) ; use npm lib after `npm install voca`

(enable-console-print!)

(js/console.log "#app06")
(t/spy (keyword "#app07"))

; these are not called for the initial load, only subsequent loads
(defn ^:dev/before-load before []
  (println :before-load))     ; same as (println ...)

(defn ^:dev/after-load after []
  (println :after-all))     ; same as (js/console.log ...)

(defn sample []
  (set! js/newVar 3) ; create a global JS variable
  (println :js/newVar js/newVar)

  (println :voca (voca/camelCase "foo bar")) ; call npm lib function
  )

(defn ^:export init [] ; shadow will call upon initial load only
  (js/console.log "init - enter again")
  (println "Hello World")
  (sample)
  (set! (.. js/document (getElementById "app-target") -innerHTML) "Hello, Document!")
  (js/console.log "init - leave")
  )

(js/console.log "#app12")
; (init)
(js/console.log "#app14")


