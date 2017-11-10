package com.weatherSimulator

import scala.util.Random

object pressureGen {
  
  def data(minPres: Int, maxPres: Int):Int= {
    
    //Generate random value in the range of given MIN - MAX value
    val temp = minPres + Random.nextInt(maxPres-minPres)
    
    temp
    
  }
  
}