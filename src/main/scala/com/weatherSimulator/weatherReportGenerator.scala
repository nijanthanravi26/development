package com.weatherSimulator
import scala.util.Random

/**
Author Nijanthan Ravi
Created at : 10/13/2017.
*/

object weatherReportGenerator {
  
  def main(args: Array[String]): Unit = {
    
    val iteration=args(0).toInt  //Iteration Count to generate random reports
    
    for( i <- 0 until iteration)
    {
          //Get Geography data
          val (place, location) = locationData.cities(Random.nextInt(locationData.cities.length))
          val (latitude, longitude, elevation) = location
          
          //Get Timestamp data
          val timestamp=generateTimestamp.dateTime(2010,2020)
        
          //Get weather data
          val temp=temperature.zoneTemp(getTropicalZone.tropicZone(latitude))
          val con = weatherCondition.getCondition(temp)
          val pressure=pressureGen.data(elevation).round
          val humidity=humidityGen.formula(temp).round
          
          //Generate Report
          println(s"$place|$latitude,$longitude,$elevation|$timestamp|$temp|$con|$pressure|$humidity")
    }
  
}
}