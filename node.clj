(require 'cljs.build.api)

(cljs.build.api/build "src"
  {:main 'nodejs-cljs.core
   :output-to "main.js"
   :target :nodejs})

