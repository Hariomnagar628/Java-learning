package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// process collection of data in a functional and declarative manner 

// if i want to declarative and functional programming in any collections then i convert into a stream.



// What is Stream --> a sequence of  elements supporting various operations (supporting functional and declarative programing)



// How to use Streams: Source,intermediate operations & terminal operations 

 

public class StreamDemo {

    public static void main(String[] args) {
        

    List<Integer>numbers = Arrays.asList(1,2,3,4,5);
   
   //  Stream<Integer>stream = numbers.stream();
     
     // example: if i want to how many number's are even using stream 

        

    //       long count = 0;
     //      for (int num : numbers) { 
    //       if (num % 2 == 0) {
    //         count++;
   //        }
    //     }
    //       System.out.println(count);
     
    // to avoide this we can use streams  
     
     
     
     System.out.println(numbers.stream().filter(x->x%2==0).count());

     
     

        // Creating streams 
        // 1. From collection 
        List<Integer>list = Arrays.asList(1,2,3);
        Stream<Integer>stream = list.stream();


        // 2. Frome Arrays

        String arr[] = {"a","b","c"};
        Stream<String>stream2 = Arrays.stream(arr);
        
        
        






    




    }
}
