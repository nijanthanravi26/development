package com.weatherSimulator
import scala.util.Random

object getData {
  
  def main(args: Array[String]): Unit = {
  
    val (city, geo) = locationData.cities(Random.nextInt(locationData.cities.length))
      val (lat, long, ele) = geo
      val date=generateTimestamp.dateTime
     
      
      println(city,lat,long,ele,date)
  
}
}