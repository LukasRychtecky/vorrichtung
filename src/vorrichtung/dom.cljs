(ns vorrichtung.dom)


(defn nodelist->seq
    "Converts `NodeList` (live collection) to lazy sequence."
    [nl]
    (map #(.item nl %) (range (.-length nl))))


(defn all
  [selector]
  (nodelist->seq (js/document.querySelectorAll selector)))


(defn one
  [selector]
  (js/document.querySelector selector))
