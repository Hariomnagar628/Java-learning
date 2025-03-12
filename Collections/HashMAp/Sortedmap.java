package Collections.HashMAp;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

// Sortedmap is an interface that extend map and guarantees that the entries are sorted based on the keys,either in their natural ordering or by a specified comparator.

// if we want to sort anything on the  basis of key we can use Sortedmap.


// Note : Sorting is Based on the key. 


public class Sortedmap {
    

    public static void main(String[] args) {
        
        SortedMap<String,Integer>sortmap = new TreeMap<>();
        sortmap.put("Vivek",91);
        sortmap.put("shubham",92);
        sortmap.put("Mohit", 90);


        SortedMap<Integer,String>sortmap1 = new TreeMap<>();


         sortmap1.put(95,"Vivek");
        sortmap1.put(93,"Shubham");
        sortmap1.put(90,"Mohit");
         sortmap1.put(45, "Vipul");


        System.out.println(sortmap1);


        // Methods 

       System.out.println(sortmap.firstKey());
       System.out.println(sortmap.lastKey());
       System.out.println(sortmap1.headMap(91));
       System.out.println(sortmap1.tailMap(91));


    }


}
