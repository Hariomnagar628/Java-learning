package Streams;

import java.util.function.Supplier;

// It's a functional interface from java.util.function package.
// It represents a function that supplies a value, without taking any input.
// Method it defines: T get();




// ✅ When to Use Supplier?

// 1.When you want to generate values lazily (on demand).
// 2.When you don’t need to pass any argument but want to return something.
// 3.Useful in scenarios like:
// 4.Object factories
// 5.Lazy initialization
// 6.Providing default values
// 7.Caching strategies





// There has only one method get() . and  no dafault or no static methods in supplier 




public class Supplier1 {
    public static void main(String[] args) {
        

      Supplier<String> givehelloworld = ()->"Hello World!";
      System.out.println(givehelloworld.get());



    }

}
