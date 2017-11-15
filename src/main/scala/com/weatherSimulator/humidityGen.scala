package com.weatherSimulator

import scala.util.Random

object humidityGen {
  
  def data(minHumi: Int, maxHumi: Int):Int= {
    
    //Generate random value in the range of given MIN - MAX value
    val temp = minHumi + Random.nextInt(maxHumi-minHumi)
    
    temp
    
  }
  
  val dewPointTemperature=16
  
  def formula(airTemperature:Int):Double={
    
    val satVaporPressure=6.11*10.0*(7.5*airTemperature/(237.7+airTemperature))
    val actVaporPressure=6.11*10.0*(7.5*dewPointTemperature/(237.7+dewPointTemperature))
    val relativeHumidity=(actVaporPressure/satVaporPressure)*100
    relativeHumidity
  }
  
}