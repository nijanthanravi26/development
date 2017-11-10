package com.weatherSimulator

object weatherCondition {
  
  def getCondition(temperature: Int):String = {
    
    var status = "Temp"
    
    //Generate weather condition based on temperature
    if (temperature > 0 && temperature < 15) {
      status="Rainy"
    } else if (temperature >= 15 && temperature <= 45) {
      status="Hot" 
    } else {
      status="Snow" 
    }
    status
  }
  
}