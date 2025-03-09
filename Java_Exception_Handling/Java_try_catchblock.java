package Java_Exception_Handling;

public class Java_try_catchblock {
    

    public static void main(String[] args) {
        


        

         try{


             // code that generate exception
            int number = 100;
            int result = number/0;

            System.out.println("Rest of code try block");

         }catch(ArithmeticException e)
         {
            System.out.println("ArithmeticException=> "+e.getMessage());
         }        


    }


}
