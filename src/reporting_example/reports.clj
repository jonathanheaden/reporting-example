(ns reporting-example.reports
  (:require [clj-pdf.core :refer [pdf template]]
            [reporting-example.models.db :as db]))

(def employee-template
  (template [$name $occupation $place $country]))

(pdf
 [{:header "Wow that was easy"}
  [:list
   [:chunk {:style :bold} "a bold item"]
   "another item"
   "yet another item"]
  [:paragraph "I'm a paragraph!"]]
 "doc.pdf")
