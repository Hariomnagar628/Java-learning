package Streams;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Consumer1 {

// Consumer is a functional interface  there has a one method accept(). and returns nothing 
// void accept(T t);



    public static void main(String[] args) {
        

        Consumer<Integer> print = (x)-> System.out.println(x);
        print.accept(5);



        // Biconsumer

        BiConsumer<Integer,Integer>biConsumer = (x,y)->System.out.println(x+y);
        biConsumer.accept(3, 4);




    }
    
}
