package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import Stringmethods.lowercase;

public class Intermediateoperations {
 
    
    public static void main(String[] args) {
        

        //  Intermediate operations transform a stream into another stream 
        // They are lazy, meaning they don't execute untill  a terminal operaton is invoked.


        // 1. Filter

        List<String>list = Arrays.asList("Akshit","Ram","Shyam","Ghanshyam","Akshit");
         Stream<String>filteredstream= list.stream().filter(x->x.startsWith("A"));
          
         // no filtering at this point 

         Long result = list.stream().filter(x->x.startsWith("A")).count();
         System.out.println(result);
         


        // 2. map

        Stream<String>newlist =  list.stream().map(x->x.toUpperCase());
        newlist.forEach(System.out::println);

        // 3. sorted
        // sorted in natural ordering 
        Stream<String>sortedstream=list.stream().sorted();
        
        // by giving comparator 
        Stream<String>sortedstreamusingcomparator=list.stream().sorted((x,y)->x.length()-y.length());
        

        sortedstream.forEach(System.out::println); 

    

        // 4. distinct 
        
        System.out.println(list.stream().filter(x->x.startsWith("A")).distinct().count());



          // 5. limit
         
          System.out.println(Stream.iterate(1, x->x+1).limit(100).count());  

          // 6.skip
          System.out.println(Stream.iterate(1, x->x+1).skip(10).limit(100).count());


    }


}
