package com.weatherSimulator

// Ref : https://www.engineeringtoolbox.com/standard-atmosphere-d_604.html
// Ref : https://www.latlong.net/place/new-york-city-ny-usa-1848.html

object locationData {
  
  // Add sample data to generate weather report
  val cities: List[(String, (Double, Double, Double))] = List(
 "Mexico"->(34.307144,-106.018066,1951),
"Dallas"->(37.685299,-93.017570,291),
"Oklahoma"->(36.084621,-96.921387,277),
"Colorado"->(39.113014,-105.358887,2500),
"KansasCity"->(39.007504,-94.529625,250),
"Arizona"->(34.048927,-111.093735,1534),
"LasVegas"->(36.114647,-115.172813,644),
"MissouriState"->(38.573936,-92.603760,257),
"Tennessee"->(35.860119,-86.660156,232),
"Atlanta"->(33.753746,-84.386330,313),
"Jacksonville"->(30.332184,-81.655647,5),
"Washington"->(39.014050,-77.065674,89),
"Indiana"->(40.267193,-86.134903,274)
  )
  
}