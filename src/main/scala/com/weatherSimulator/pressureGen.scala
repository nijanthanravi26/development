package com.weatherSimulator

import scala.util.Random

object pressureGen {
  
  def data(minPres: Int, maxPres: Int):Int= {
    
    val temp = minPres + Random.nextInt(maxPres-minPres)
    
    temp
    
  }
  
}