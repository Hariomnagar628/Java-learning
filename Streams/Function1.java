package Streams;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

// Function: It is a functional interface there has only one abstract method apply().
// Function<T,R> : T-> type , R-> return type 

public class Function1 {
    
    public static void main(String[] args) {
        

         Function<Integer,Integer> doubleit = x->x*2;
         System.out.println("doubit : "+doubleit.apply(100));

         Function<Integer,Integer> tripleit = x->x*3;
         System.out.println("tripleit : "+tripleit.apply(200));

         // andthen() are the default method 
         // compose are also default method and  many methods are default

         
         // in this first doubleit called then triple it 
         System.out.println("applyboth : "+doubleit.andThen(tripleit).apply(100));



       // inthis method first tripleit called then doubleit
          System.out.println(doubleit.compose(tripleit).apply(300));
       
         


          // it is will print the same output
          Function<Integer,Integer>identity = Function.identity();
          Integer result = identity.apply(34);
          System.out.println(result);



          //Bifunction

          BiFunction<String,String,Integer>biFunction = (x,y)->(x+y).length();
          System.out.println(biFunction.apply("hello", "world"));




         // Additional information

        //  Function<Integer,Integer> doubleit1 = x->x*2; 
        // in above we given Function<Integer,Interger>  to avoid this use UnaryOperator<Integer>
        
        UnaryOperator<Integer>doubleit1 = x->x*2;
        System.out.println(doubleit1.apply(4));  

        
        BinaryOperator<Integer>addtion = (x,y)->x+y;
        System.out.println(addtion.apply(34, 38));
        
        



        }
}
