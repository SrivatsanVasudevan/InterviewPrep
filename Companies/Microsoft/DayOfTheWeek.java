/*
Day of week that is K days later
*/

public static String dayOfTheWeek(String day, int k){
   if(day == "") return "";// handle case where day is not in days as well.
   String days[] = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};

   HashMap<String,Integer> map = new HashMap<>();
   for(int i=0;i<days.length;i++){
       map.put(days[i],i);
   }

   return days[(map.get(day)+k)%days.length];
}
