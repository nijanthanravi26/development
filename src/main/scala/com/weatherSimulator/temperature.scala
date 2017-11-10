package com.weatherSimulator

object temperature {
  
  def readings(minTemp: Int, maxTemp: Int):Int= {
    
    val temp = minTemp + Randowm.nextInt(maxTemp-minTemp)
    
    temp
    
  }
  
}