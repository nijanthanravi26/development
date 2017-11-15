package com.weatherSimulator

import scala.util.Random

object temperature {
  
  def tempScale(minTemp: Int, maxTemp: Int):Int= {
    //Generate random value in the range of given MIN - MAX value
    val temp = minTemp + Random.nextInt(maxTemp-minTemp)
    temp
  }
  
  def zoneTemp(zone:String):Int={
    
    if (zone=="Tropical_Zone") {
      tempScale(0,40)
    } else if (zone=="Sub_Tropical_Zone") {
       tempScale(-5,50)
    } else if (zone="Temperate_Zone") {
       tempScale(-30,30)
    } else if (zone="Cold_Zone" ) {
      tempScale(-90,25)
    }else {
      tempScale(0,0)
    }
  }
  
}