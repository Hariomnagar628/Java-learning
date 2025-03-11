package Collections.HashMAp;
import java.util.HashMap;
import java.util.Map;

import Stringmethods.lowercase;
public class Hashmap {

    public static void main(String[] args) {
        
        Map<Integer,String> hashmap = new HashMap<>();

        hashmap.put(1,"Java");
        hashmap.put(2,"JavaScript");
        hashmap.put(3,"Pythone");
        
        System.out.println("HashMap: " + hashmap);



        // get() method to get values;

        String name = hashmap.get(1);
        System.out.println(name);

        
        // return set view of keys
        // using keySet()


        System.out.println("Keys: " + hashmap.keySet());


          // return set view of values
         // using values()

         System.out.println("Values : " + hashmap.values());



          // return set view of key/value pairs
         // using entrySet()


         System.out.println("Key/value mapping : "+hashmap.entrySet());



          // change element with key 2

          hashmap.replace(2, "C++");
          System.out.println(hashmap);


    // remove element associated with key 2
    String langname = hashmap.remove(2);
    System.out.println(langname);
    System.out.println(hashmap);









    }
    
}

