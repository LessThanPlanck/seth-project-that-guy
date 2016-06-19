;; never EVER eval obscured code
(let [solution "CihsZXQgW3NxdWFyZWQtc3VtICAgICgqIDIgKHJlZHVjZSArIChyYW5nZSAxIDEwMSkpKQogICAgICBzdW0tb2Ytc3F1YXJlcyAocmVkdWNlICsgKG1hcCAjKCogJTEgJTEpIChyYW5nZSAxIDEwMSkpKV0KICAoLSBzdW0tb2Ytc3F1YXJlcyBzcXVhcmVkLXN1bSkpCg=="
      ]
  (print (eval (:out (clojure.java.shell/sh "base64" "--decode" "-" :in solution)))))
