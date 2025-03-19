package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Terminaloperations {
     public static void main(String[] args) {
 
        List<Integer> list = Arrays.asList(1,2,3);

        // 1.collect

        // skip(1) -> means 1 element is missing
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList(); // we can also write this 

        // 2. foreach 

        list.stream().forEach(x->System.out.println(x));


        // 3. reduce: Combines elements to produce a single result 

        list.stream().reduce((x,y)->x+y);

        // 4.count 

        // 5. anymatch,allmatch,nonematch

        // anymatch -> it will return true if anyone is match
        // allmatch -> it will return true if all are match

        boolean b = list.stream().anyMatch(x->x%2==0);
        System.out.println(b);

        boolean b1 = list.stream().allMatch(x->x>0);
        System.out.println(b1);

        boolean b3 = list.stream().noneMatch(x->x<0);
        System.out.println(b3);


        // 6.findfirst,findany  


        // Example: if i want to print the strings whose length is greater then 3

        List<String> string = Arrays.asList("Anna","Bob","Charlie","David");
       
        System.out.println(string.stream().filter(x->x.length()>3).toList());


      // Example: Squaring and sorting numbers

      List<Integer> list1 = Arrays.asList(5,4,2,8);

      System.out.println(list1.stream().map(x->x*x).sorted().toList());
        


      // sum the values

      List<Integer>numbers = Arrays.asList(1,2,3,4);
      System.out.println(numbers.stream().reduce(Integer::sum));


      // counting occurence of character

      String newstring= "Hello World";

      System.out.println(newstring.chars().filter(x->x=='l').count());
      



        
        
 
    }

}

