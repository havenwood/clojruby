(ns clojruby.core)

(import '(org.jruby.embed ScriptingContainer))

(defn dojruby [x]
  (. (ScriptingContainer.) runScriptlet x))
