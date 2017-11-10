package com.weatherSimulator
import scala.util.Random

object getData {
  
  def main(args: Array[String]): Unit = {
  
      val (place, location) = locationData.cities(Random.nextInt(locationData.cities.length))
      val (latitude, longitude, elevation) = location
      
      val timestamp=generateTimestamp.dateTime(2010,2020)
//      val dateFormat = datetime.split(",")
//      val date = dateFormat(0)
//      val month = dateFormat(1)
//      val year = dateFormat(2)
//      val hms = dateFormat(3)
//      
//      val timestamp = date+"-"+month+"-"+year" "+hms
      
      
      val temp=temperature.readings(-45,45)
      val con = weatherCondition.getCondition(temp)
      val pressure=pressureGen.data(800,1200)
      val humidity=humidityGen.data(10,100)
      
    println(s"$place,$latitude,$longitude,$elevation,$timestamp,$temp,$con,$pressure,$humidity")
    //println(place,latitude,longitude,elevation,date,temp)
  
}
}