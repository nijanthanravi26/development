# development

Weather Simulator:

Generator random weather data set based on input number.

To Run:

spark-submit --class <class name> --master yarn < Jar name > <required number of data>

Sample Run:

[nijanthan@ip-10-0-0-xxx weather]$ spark-submit --class com.weatherSimulator.weatherReportGenerator 
--master yarn /home/nijanthan/weather/target/scala-2.10/weather_2.10-0.1-SNAPSHOT.jar 20
Jacksonville,30.332184,-81.655647,5.0,4-7-2013 21:57:39,22,Hot,1020,29
Atlanta,33.753746,-84.38633,313.0,3-3-2014 18:34:39,1,Rainy,955,61
Jacksonville,30.332184,-81.655647,5.0,6-8-2014 14:03:39,5,Rainy,999,53
Atlanta,33.753746,-84.38633,313.0,26-0-2016 20:26:39,-15,Snow,867,20
Jacksonville,30.332184,-81.655647,5.0,7-11-2010 17:46:39,-23,Snow,1160,73
Washington ,39.01405,-77.065674,89.0,8-7-2016 19:54:39,-28,Snow,1116,53
KansasCity,39.007504,-94.529625,250.0,20-0-2019 14:39:39,23,Hot,1008,71
Oklahoma,36.084621,-96.921387,277.0,22-1-2019 08:04:39,42,Hot,843,78
Colorado,39.113014,-105.358887,2500.0,6-7-2015 12:37:39,42,Hot,962,47
Oklahoma,36.084621,-96.921387,277.0,8-5-2017 05:55:39,19,Hot,818,74
Indiana,40.267193,-86.134903,274.0,20-6-2010 09:07:39,15,Hot,945,93
Atlanta,33.753746,-84.38633,313.0,24-11-2015 09:16:39,34,Hot,1170,67
MissouriState,38.573936,-92.60376,257.0,28-10-2013 12:47:39,17,Hot,943,24
KansasCity,39.007504,-94.529625,250.0,13-10-2014 14:15:39,38,Hot,1055,39
Tennessee,35.860119,-86.660156,232.0,26-7-2012 03:12:39,29,Hot,1055,54
Atlanta,33.753746,-84.38633,313.0,31-0-2014 12:37:39,-20,Snow,1034,89
Mexico,34.307144,-106.018066,1951.0,10-10-2012 15:40:39,-15,Snow,1155,39
Arizona,34.048927,-111.093735,1534.0,1-5-2017 02:22:39,-11,Snow,888,94
Washington ,39.01405,-77.065674,89.0,29-8-2011 13:38:39,-2,Snow,830,66
Washington ,39.01405,-77.065674,89.0,14-11-2017 22:08:39,-11,Snow,1193,78
