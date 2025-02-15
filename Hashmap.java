import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
       
       int [] arr = {1,2,3,42};

        Map<Integer,Integer> map = new HashMap<>();

        for(int num:arr)
        {
             map.put(num,map.getOrDefault(num,0)+1);
        }

       
        int maxele = -1; 
        int maxfreq=-1;


       for(Map.Entry<Integer,Integer> entry:map.entrySet())
       {
           if(entry.getValue()>maxfreq)
           {

             maxfreq=entry.getValue();
             maxele=entry.getKey();

           }
       }

         
          System.out.println(maxele+"-->"+maxfreq);


    }
}
