package com.weatherSimulator

object getTropicalZone {
  
  def tropicZone(latitude: Double):String = {
    
    var zone = "Temp"
    
    //Generate weather condition based on temperature
    if (latitude > 0 && latitude <= 23) {
      zone="Tropical_Zone"
    } else if (latitude > 23 && latitude <= 40) {
      zone="Sub_Tropical_Zone" 
    } else if (latitude > 40 && latitude <= 60) {
      zone="Temperate_Zone" 
    } else if (latitude > 60 && latitude <= 90) {
      zone="Cold_Zone" 
    }else {
      zone="Invalid_Latitude_Data" 
    }
    
    zone
  }
  
}