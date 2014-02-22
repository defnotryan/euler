(ns euler.p1)

;; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
;; The sum of these multiples is 23.

;; Find the sum of all the multiples of 3 or 5 below 1000.

(defn multiples-of [n]
  (iterate (partial + n) 0))

(let [less-than-1000 (partial > 1000)]
  (apply + (concat
            (take-while less-than-1000 (multiples-of 3))
            (take-while less-than-1000 (multiples-of 5)))))
