package com.weatherSimulator

//Ref : https://en.wikipedia.org/wiki/Temperate_climate#/media/File:World_map_indicating_tropics_and_subtropics.png


object getTropicalZone {
  
  def tropicZone(latitude: Double):String = {
    
    var zone = "Temp"
    
    //Classify tropical zone based LATITUDE of the given location.
    
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