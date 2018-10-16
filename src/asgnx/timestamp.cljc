(ns asgnx.timestamp
  (:require [clojure.string :as string])
  #? (:clj
      (:import  [java.util Locale]
                [java.time LocalDateTime])))

(defn date-time-now-str []
 #?(:clj
    (.format
     (java.time.format.DateTimeFormatter/ofPattern
         "MM/dd/yyyy HH:mm"
         java.util.Locale/ENGLISH)
     (java.time.LocalDateTime/now))

    :cljs
    (let [d (js/Date.)]
     (+
       ;;(+ (.getMonth d) 1) "/"
       ;;(.getDate d) "/"
       ;;(.getFullYear d) " "
       (.getHours d)
       ( / (.getMinutes d) 60)))))
