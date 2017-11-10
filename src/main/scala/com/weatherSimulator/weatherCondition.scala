package com.weatherSimulator

object weatherCondition {
  
  def getCondition(temperature: Int):String = {
    
    var status = null.toString
    
    if (temperature > 0 && temperature < 15) {
      status="Rainy"
    } else if (temperature > 15 && temperature < 45) {
      status="HoT" 
    } else {
      status="Snow" 
    }
    status
  }
  
}