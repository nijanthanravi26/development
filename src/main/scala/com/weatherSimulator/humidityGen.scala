package com.weatherSimulator

import scala.util.Random

object humidityGen {
  
  def data(minHumi: Int, maxHumi: Int):Int= {
    
    //Generate random value in the range of given MIN - MAX value
    val temp = minHumi + Random.nextInt(maxHumi-minHumi)
    
    temp
    
  }
  
}