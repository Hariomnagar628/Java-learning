package Streams;

// Lambdas are awesome, but limited to functional interfaces only.



 interface calculater {

   int operation(int a ,int b);
   
    
} 

public class LaMbda {
    
    public static void main(String[] args) {

        calculater addition = (a,b)->a+b;
        calculater multiply = (a,b)->a*b;
        
        System.out.println(addition.operation(34, 50));
        System.out.println(multiply.operation(12, 65));

    }

}
