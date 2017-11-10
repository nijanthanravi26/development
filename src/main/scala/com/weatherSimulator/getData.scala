package com.weatherSimulator

import com.weatherSimulator.locationData

object getData {
  
  def main(args: Array[String]): Unit = {
  
    val (city, geo) = locationData.cities(Random.nextInt(locationData.cities.length))
      val (lat, long, ele) = geo
      val elevation = Elevation(ele)
      
      println(lat,long,ele)
  
}
}