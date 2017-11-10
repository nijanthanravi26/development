package com.weatherSimulator

object weatherCondition {
  
  def getCondition(temperature: Int) = {
    if (temperature > 0 && temperatur < 15) {
      Rainy
    } else if (temperature > 15 && temperatur < 45) {
      HoT 
    } else {
      Snow 
    }
  }
  
}