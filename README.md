# development

Weather Simulator:

Generator random weather data set based on input number.

To Run:

spark-submit --class <class name> --master yarn < Jar name > <required number of data>

Sample Run:

[nijanthan@ip-10-0-0-xxx weather]$ spark-submit --class com.weatherSimulator.weatherReportGenerator 
--master yarn /home/nijanthan/weather/target/scala-2.10/weather_2.10-0.1-SNAPSHOT.jar 10
Arizona|34.048927,-111.093735,1534.0|7-6-2011 21:04:55|18|Hot|814|88
Oklahoma|36.084621,-96.921387,277.0|23-0-2019 07:43:55|48|Snow|974|16
Atlanta|33.753746,-84.38633,313.0|10-0-2015 13:22:55|4|Rainy|969|223
Chennai|13.067439,80.237617,13.0|13-11-2019 06:19:55|8|Rainy|1011|169
Dallas|37.685299,-93.01757,291.0|17-10-2013 11:30:55|39|Hot|972|26
Arizona|34.048927,-111.093735,1534.0|14-3-2015 05:17:55|12|Rainy|814|130
Chennai|13.067439,80.237617,13.0|3-2-2017 13:49:55|19|Hot|1011|83
Colorado|39.113014,-105.358887,2500.0|27-1-2019 02:41:55|23|Hot|709|65
Chennai|13.067439,80.237617,13.0|17-3-2013 17:46:55|28|Hot|1011|48
Tennessee|35.860119,-86.660156,232.0|21-2-2017 09:41:55|17|Hot|980|94
