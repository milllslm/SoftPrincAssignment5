(ns asgnx.timestamp
  (:require [clojure.string :as string])
  #? (:clj
      (:import  [java.util Locale]
                [java.time LocalDateTime])))

(defn date-time-now-str []
 #?(:clj (System/currentTimeMillis)
    :cljs (.getTime(js/Date.))))
