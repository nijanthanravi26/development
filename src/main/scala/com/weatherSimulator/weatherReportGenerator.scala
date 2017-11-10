package com.weatherSimulator
import scala.util.Random

/**
Author Nijanthan Ravi
Created at : 10/11/2017.
Last Modified : 10/11/2017 
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
          val temp=temperature.readings(-45,45)
          val con = weatherCondition.getCondition(temp)
          val pressure=pressureGen.data(800,1200)
          val humidity=humidityGen.data(10,100)
          
          //Generate Report
          println(s"$place,$latitude,$longitude,$elevation,$timestamp,$temp,$con,$pressure,$humidity")
    }
  
}
}