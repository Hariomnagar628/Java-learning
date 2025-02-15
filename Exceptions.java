public class Exceptions {
public static void main(String[] args) {
   try{
    int array[] = {1,2,3,4};
    System.out.println(array[10]);
   }
   catch(Exception e) 
   {  
     System.out.println("Something is wrong");

   }finally{
    System.out.println("the try,catch is finished");
   }
}
    
}
