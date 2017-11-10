package com.weatherSimulator

import scala.util.Random

object humidityGen {
  
  def data(minHumi: Int, maxHumi: Int):Int= {
    
    val temp = minHumi + Random.nextInt(maxHumi-minHumi)
    
    temp
    
  }
  
}