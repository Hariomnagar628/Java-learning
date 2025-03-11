package Collections.HashMAp;
import java.util.LinkedHashMap;
import java.security.KeyStore.Entry;
import java.util.HashMap;

public class LinkedHashmap {
 
    
// In linked Hashmap order will be mentain.
    public static void main(String[] args) {
        
     LinkedHashMap<String,Integer> linkedhashmap = new LinkedHashMap<>();

     // linked hashmap used doubly linkedlist. and it is slow as compare to hashmap and also memory.
     // we use linkedhashmap if order does metter.
     
     
     linkedhashmap.put("Orange", 10);
     linkedhashmap.put("Apple",20);
     linkedhashmap.put("Guava",13);


     for(java.util.Map.Entry<String, Integer> entry:linkedhashmap.entrySet())
     {
         System.out.println(entry.getKey()+":"+entry.getValue());

     }





      


    }


}
