package com.weatherSimulator

import scala.util.Random

object humidityGen {
  
 
  val dewPointTemperature=16
  
  def formula(airTemperature:Int):Double={
    
    val satVaporPressure=6.11 * Math.pow(10.0,(7.5*airTemperature/(237.7+airTemperature)))
    val actVaporPressure=6.11 * math.pow(10.0,(7.5*dewPointTemperature/(237.7+dewPointTemperature)))
    val relativeHumidity=(actVaporPressure/satVaporPressure)*100
    relativeHumidity
  }
  
}