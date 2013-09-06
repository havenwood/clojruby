(ns clojruby.core-test
  (:require [clojure.test :refer :all]
            [clojruby.core :refer :all]))

(deftest a-test
  (testing "JRuby works in Clojure."
    (is (= (dojruby "JRUBY_VERSION") "1.7.4"))))
