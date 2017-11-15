package com.weatherSimulator

import scala.util.Random

//Ref : http://www.wral.com/how-to-calculate-relative-humidity/1174528/

object humidityGen {
  
 
  val dewPointTemperature=16
  
  def formula(airTemperature:Int):Double={
    
    //Calculate relative humidity using dew point temperature and air temperature.
    val satVaporPressure=6.11 * Math.pow(10.0,(7.5*airTemperature/(237.7+airTemperature)))
    val actVaporPressure=6.11 * math.pow(10.0,(7.5*dewPointTemperature/(237.7+dewPointTemperature)))
    val relativeHumidity=(actVaporPressure/satVaporPressure)*100
    relativeHumidity
  }
  
}