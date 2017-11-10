package com.weatherSimulator

import scala.util.Random

object temperature {
  
  def readings(minTemp: Int, maxTemp: Int):Int= {
    
    val temp = minTemp + Random.nextInt(maxTemp-minTemp)
    
    temp
    
  }
  
}