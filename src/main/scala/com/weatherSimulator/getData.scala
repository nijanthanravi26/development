package com.weatherSimulator
import scala.util.Random

object getData {
  
  def main(args: Array[String]): Unit = {
  
    val (place, location) = locationData.cities(Random.nextInt(locationData.cities.length))
      val (latitude, longitude, elevation) = location
      val date=generateTimestamp.dateTime(2010,2020)
      val temperature=temperature.readings(-45,45)
     
      
      println(place,latitude,longitude,elevation,date,temperature)
  
}
}