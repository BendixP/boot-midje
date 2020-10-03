;; -*- mode: Clojure; -*-
(set-env!
 :source-paths #{"src"}
 :dependencies '[[org.clojure/clojure "1.10.1"    :scope "provided"]
                 [boot/core           "2.8.2"     :scope "provided"]
                 [adzerk/bootlaces    "0.2.0"     :scope "test"]])

(require '[adzerk.bootlaces :refer :all]
         '[zilti.boot-midje :refer [midje]])

(def +version+ "0.3.0-SNAPSHOT")

(bootlaces! +version+)

(task-options!
 pom {:project 'BendixP/boot-midje
      :version +version+
      :description "Run midje tests in boot."
      :url "https://github.com/BendixP/boot-midje"
      :scm {:url "https://github.com/BendixP/boot-midje"}
      :license {"Eclipse Public License" "http://www.eclipse.org/legal/epl-v10.html"}}
 midje {:test-paths #{"test"}})
