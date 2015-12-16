(require 'digest)

(ns advent.four)

(defn mine
  ""
  [secret-key]
  (loop [n 0]
    (let [md5 (digest/md5 (str secret-key n))]
      (if (= (apply str (take 5 md5)) "00000")
        n
        (recur (inc n))))))

;(digest/md5 "abcdef609043")
(defn -main
  ""
  []
  (println (mine "bgvyzdsv")))