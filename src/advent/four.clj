(require 'digest)

(ns advent.four)

(defn make-lead-zeros
  ""
  [n]
  (apply str (take n (cycle ["0"]))))

(defn mine
  ""
  [secret-key leading-zeros]
  (loop [n 0]
    (let [md5 (digest/md5 (str secret-key n))]
      (if (= (apply str (take leading-zeros md5)) (make-lead-zeros leading-zeros))
        n
        (recur (inc n))))))

;(digest/md5 "abcdef609043")
(defn -main
  ""
  []
  (println 
    (str
      (mine "bgvyzdsv" 5)
      " - "
      (mine "bgvyzdsv" 6))))