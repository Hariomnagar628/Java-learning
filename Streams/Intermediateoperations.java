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

        List<String>list = Arrays.asList("Akshit","Ram","Shyam","Ghanshyam");
         Stream<String>filteredstream= list.stream().filter(x->x.startsWith("A"));
          
         // no filtering at this point 

         Long result = list.stream().filter(x->x.startsWith("A")).count();
         System.out.println(result);
         


        // 2. map

        Stream<String>newlist =  list.stream().map(x->x.toUpperCase());
        newlist.forEach(System.out::println);

        // sorted
        // sorted in natural ordering 
        Stream<String>sortedstream=list.stream().sorted();
        sortedstream.forEach(System.out::println);

    
           




    }


}
