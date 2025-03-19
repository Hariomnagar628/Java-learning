package Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

// Method refrence --> use method without invoking & in place of lambda expression 



public class MethodRefrence {
    
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ram","Shyam","Ankit");

        list.forEach(x->System.out.println(x));
        list.forEach(System.out::println); // method refrence 

    }

}
