package com.weatherSimulator

// REF : https://www.quora.com/How-do-I-calculate-altitude-based-on-air-pressure
// REF : https://www.britannica.com/science/atmospheric-pressure

import scala.util.Random

object pressureGen {
  
  val SeaLevelPressure=1013.25
  val scaleHeight=7000
  
  def data(elevation:Double): Double = {
     SeaLevelPressure * Math.pow(Math.E,-(elevation / scaleHeight ))
  }
  
}