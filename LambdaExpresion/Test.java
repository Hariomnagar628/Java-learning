package LambdaExpresion;

// it is also known as anonymouse function 
// Lambda Expression = A short way to write functions / methods without creating a separate class.

// It was introduced in Java 8, and it makes code simpler, shorter, and cleaner, especially when working with functional interfaces, collections, and streams.


// A Functional Interface is an interface that contains only one abstract method (can have default/static methods too, but only one abstract method).


@FunctionalInterface    
interface Calculater{

    int operations(int a,int b);
}


public class Test {
    

      public static void main(String[] args) {
    
        Calculater add = (a,b)->{return a+b;};
        Calculater multiply = (a,b)->a*b;
        
        System.out.println("sum:"+add.operations(33, 20));
        System.out.println("multiply:"+multiply.operations(20, 50));



    }

}
