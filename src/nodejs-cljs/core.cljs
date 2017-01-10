(ns nodejs-cljs.core
  (:require [cljs.nodejs :as nodejs]
            [cljsjs.react]
            [cljsjs.react.dom]))

(nodejs/enable-util-print!)

(defn -main [& args]
  (println "Hello world!"))

(set! *main-cli-fn* -main)

