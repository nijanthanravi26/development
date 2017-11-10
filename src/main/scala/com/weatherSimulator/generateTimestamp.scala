package com.weatherSimulator

import java.util.{Calendar, Date, TimeZone}
import scala.util.Random

object generateTimestamp {
  
  def dateTime(startYear: Int, endYear: Int)= {
    
    val cal = Calendar.getInstance(TimeZone.getDefault)
    cal.set(Calendar.YEAR, startYear + Random.nextInt(Math.abs(endYear - startYear)))
    cal.set(Calendar.DAY_OF_YEAR, Random.nextInt(cal.getActualMaximum(Calendar.DAY_OF_YEAR)))
    val timestamp=cal.getTime
    val date = timestamp.getDate
    val month = timestamp.getMonth
    val year = timestamp.getYear
    val hours = timestamp.getHours
    val min = timestamp.getMinutes
    val seconds = timestamp.getSeconds
    
    println(date,month,year,hours,min,seconds)
    
  }
  
}