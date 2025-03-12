package Collections.Hash_Table;

import java.util.Hashtable;
import java.util.Map;

// It's a legacy class 
// A Legacy Class refers to a class that was part of the old Java versions (before Java 2/Java Collections Framework - JDK 1.2).
// These classes were part of Java before the modern collection classes like ArrayList, HashMap, HashSet, etc.  
// all methods are synchronized.

// Vector	      Like ArrayList but synchronized
// Stack	      Subclass of Vector, LIFO behavior
// Hashtable	  Like HashMap but synchronized
// Enumeration	  Old way to iterate collections
// Properties	  Stores key-value pairs (often used for config files)


// Hashtable (legacy class) does NOT allow null keys or values.
// Hashtable.put(null, "abc") → throws NullPointerException

 




public class Hashtabledemo {
    

    public static void main(String[] args) {
        


        Hashtable<Integer,String> hash = new Hashtable<>();

        hash.put(1,"Apple");
        hash.put(2,"Banana");
        hash.put(3,"Cherry");

        System.out.println(hash);



    }


}
