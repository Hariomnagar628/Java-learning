package Collections.HashMAp;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;


enum Day{

    Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday 
}




public class Enummap {
    
    public static void main(String[] args) {
    
        

     Map<Day,String>map = new EnumMap<>(Day.class);

     map.put(Day.Saturday,"Gym");
     map.put(Day.Tuesday,"Walk");
     System.out.println(map);

  
     // Ordinal() --> it will return index

     System.out.println(Day.Sunday.ordinal());





    }

}
