package com.weatherSimulator

import java.util.{Calendar, Date, TimeZone}
import scala.util.Random

object generateTimestamp {
  
  def dateTime(startYear: Int, endYear: Int):String = {
    
    val cal = Calendar.getInstance(TimeZone.getDefault)
    cal.set(Calendar.YEAR, startYear + Random.nextInt(endYear - startYear))
    cal.set(Calendar.DAY_OF_YEAR, Random.nextInt(cal.getActualMaximum(Calendar.DAY_OF_YEAR)))
    
    val timestamp=cal.getTime
    val date = timestamp.getDate
    val month = timestamp.getMonth
    
    val timeString=cal.getTime.toString.split("\\s+")
    val year = timeString(5)
    val hms = timeString(3)
    
    val dateformat = date+"-"+month+"-"+year+" "+hms
    dateformat
    
  }
  
}