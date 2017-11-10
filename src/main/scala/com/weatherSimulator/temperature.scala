package com.weatherSimulator

import scala.util.Random

object temperature {
  
  def readings(minTemp: Int, maxTemp: Int):Int= {
    //Generate random value in the range of given MIN - MAX value
    val temp = minTemp + Random.nextInt(maxTemp-minTemp)
    
    temp
    
  }
  
}