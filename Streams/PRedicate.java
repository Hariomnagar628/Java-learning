package Streams;


import java.util.function.BiPredicate;
import java.util.function.Predicate;





// Why we need Streams in java 

// 1. Cleaner and More Readable Code
// Streams let you write concise code for processing collections (like lists, sets, etc.) without traditional for or while loops.



// 2. Functional Programming Style
// Java Streams encourage a more functional programming approach, using lambda expressions, making code expressive and declarative (what to do, not how to do).





// 3. Easier Data Transformations
// You can easily filter, map, sort, group, etc., in a chainable and elegant way.


// 4. Parallel Processing Made Easy
// Want to use multi-core performance? Just use .parallelStream() and Java will handle parallelism under the hood.





// Streams was introduced in Java-8

// for minimal code , functional programing
// lambda expresion's, Streams,Dae & Time API


public class PRedicate {
    

    public static void main(String[] args) {
        

        // Predicate --> Predicate is  Functional interface (Boolean valued function) 
        // Boolean test(T t);


        Predicate<Integer> isEven = x -> x%2==0;
        System.out.println(isEven.test(70));

        Predicate<String> isstartwitha = y -> y.startsWith("a");
        System.out.println(isstartwitha.test("arm"));
        
        Predicate<String> isEndwith = z ->z.endsWith("t");
        System.out.println(isEndwith.test("art"));



        // combine them using and 
       Predicate<String> and = isstartwitha.and(isEndwith);
       System.out.println(and.test("ankit"));



     // Bipredicate 

     BiPredicate<Integer,Integer>bipredicate = (x,y)->(x+y)%2==0;

      System.out.println(bipredicate.test(4, 2));



       

        

        

        
        

    }


}
