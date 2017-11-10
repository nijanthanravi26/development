package com.weatherSimulator

import java.util.{Calendar, Date, TimeZone}
import scala.util.Random

object generateTimestamp {
  
  def dateTime(startYear: Int, endYear: Int):String = {
    
    //Get calendar instance and update random value for YEAR, DAY, HOUR,MINUTE
    val cal = Calendar.getInstance(TimeZone.getDefault)
    cal.set(Calendar.YEAR, startYear + Random.nextInt(endYear - startYear))
    cal.set(Calendar.DAY_OF_YEAR, Random.nextInt(cal.getActualMaximum(Calendar.DAY_OF_YEAR)))
    cal.set(Calendar.HOUR_OF_DAY,Random.nextInt(23))
    cal.set(Calendar.MINUTE,Random.nextInt(60))
    
    //Fetch date,month,year,hour,minute,seconds value from randomly created timestamp
    val timestamp=cal.getTime
    val date = timestamp.getDate
    val month = timestamp.getMonth
    
    val timeString=cal.getTime.toString.split("\\s+")
    val year = timeString(5)
    val hms = timeString(3)
    
    //Frame the values in required format
    val dateformat = date+"-"+month+"-"+year+" "+hms
    dateformat
    
  }
  
}