package Collections.HashMAp;

import java.security.KeyStore.Entry;
import java.util.HashMap;


// In hashmap order does not mentain.

public class Hashmap1 {
    
public static void main(String[] args) {
    

// Iterate through a HashMap

   // create a HashMap
    HashMap<Integer, String> languages = new HashMap<>();
    languages.put(1, "Java");
    languages.put(2, "Python");
    languages.put(3, "JavaScript");
    System.out.println("HashMap: " + languages);

 
     // Iterate through keys only
     System.out.print("\nKeys:");

     for(int i:languages.keySet())
     {
        System.out.print(i);
        System.out.print(",");
        
     }


     // iterate through values only

     System.out.print("\nValues:");
     for( String i:languages.values())
     {
        System.out.print(i);
        System.out.print(",");

     }



     // iterate through key/value entries


     System.out.println("\nEntrys");

     for(java.util.Map.Entry<Integer, String> entry:languages.entrySet())
     {
        System.out.print(entry);
        System.out.print(",");
     }


     // Anotherway of iterate

    //  for(java.util.Map.Entry<String, Integer> entry:hashmap.entrySet())
    //  {
    //      System.out.println(entry.getKey()+":"+entry.getValue());

    //  }



}


}
