
(defn hello [x] 
  (println "Hello" x))

(def variable 7)

(def variable2
  (+ variable  4))

(println "=== CLOJURE === ")
(hello "World")
(hello (str variable2))

(println "Primitives are Java boxed types")
(println (class 1)) ; java.lang.Long

(println "Equality is =")
(= 2 1)     ;false 
(= 1 1)     ;true
(= 1 1.0)   ;false

(class nil)   ;nil
(class true)  ;java.lang.Boolean 

(class '(1 2 3))  ;clojure.lang.PersistentList
(class '[])       ;clojure.lang.PersistentVector
(class {})        ;clojure.lang.PersistentArrayMap

(= (quote (+ 1 2) '(+ 1 2))) ; true
(eval '(+ 1 2)) ;3

;(list 1 2 3) = (1 2 3)
(= (list 1 2 3) '(1 2 3)) ;true

(println "Collections are just a group of data")
(coll? []) ;true
(coll? ()) ;true

(println "Sequences are abstract descrition of lists of data")
(seq? []) ;false
(seq? ()) ;true

;Range
(range 10) ;(0 1 2 3 4 5 6 7 8 9)
(take 3 (range)) ;(0 1 2) LAZY EVALUATION !!

;Cons - add as head
(cons 4 [1 2 3]) ;[4 1 2 3]
(cons 4 '(1 2 3)) ;(4 1 23)
(cons '(1 2 3) '(4 5 6)) ;((1 2 3) 4 5 6)

;Concat - can concat list with vectors too
(concat '(1 2 3) '(4 5 6)) ; (1 2 3 4 5 6)

;Map / filter
(map (fn [x] (+ x 10)) '(1 2 3)) ;(11 12 13)
(map inc [1 2 3]) ; (2 3 4). map returns SEQUENCE 
(filter even? (range 10)) ;(0 2 4 6 8) filter returns SEQUENCE
(reduce + (take 100 (range))) ;4950
(reduce + 1000 (take 10 (range))) ; 1045. Reduce can take initial-value argument too
