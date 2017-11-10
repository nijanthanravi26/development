package com.weatherSimulator

object weatherCondition {
  
  def getCondition(temperature: Int):String = {
    if (temperature > 0 && temperature < 15) {
      println("Rainy")
    } else if (temperature > 15 && temperature < 45) {
      println("HoT") 
    } else {
      println("Snow") 
    }
  }
  
}