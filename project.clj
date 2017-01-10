(defproject nodejs-cljs "0.1.0"
  :url ""
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.6.1"
  :jvm-opts ^:replace ["-Xms512m" "-Xmx512m" "-server"]
  
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.293"]
                 [cljsjs/react "15.3.1-0"]
                 [cljsjs/react-dom "15.3.1-0"]]

  :source-paths ["src/" ]
  :clean-targets ^{:protect false} [ "target"])

