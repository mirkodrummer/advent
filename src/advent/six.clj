(ns advent.six)

(use '[clojure.string :only (split split-lines)])

(def input "turn off 660,55 through 986,197")

(defn turn 
  "" 
  [op x1 y1 _ x2 y2] 
  (println 
    (str "Moving from " x1 " " y1 " to " x2 " " y2)))

(def replace-input 
  (partial replace {"turn" turn "off" :off "through" :through}))

(defn parse-input 
  "" 
  [input] 
  (seq (replace-input (split input #"( |,)"))))

(defn make-grid
  ""
  []
  (take (* 1000 1000) (cycle [0])))

(defn -main
  "Day 6: Probably a Fire Hazard"
  []
  (eval (parse-input input)))