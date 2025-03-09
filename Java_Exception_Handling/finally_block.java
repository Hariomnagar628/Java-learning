package Java_Exception_Handling;

public class finally_block {
    

public static void main(String[] args) {
    

    // In Java, the finally block is always executed no matter whether there is an exception or not.

    // The finally block is optional. And, for each try block, there can be only one finally block.




    // If an exception occurs, the finally block is executed after the try...catch block. Otherwise, it is executed after the try block. For each try block, there can be only one finally block.






    try{
    // code that generate exception

    int number= 100/0;
    


} 

catch(ArithmeticException e)
{

     System.out.println("ArithmeticException=> " + e.getMessage());
}


finally

{

    System.out.println("This is finally block");

}



}


}
