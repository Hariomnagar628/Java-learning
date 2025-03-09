package Java_Exception_Handling.throw_and_throws_keyword;

public class  Baseexception {
    
    public static void main(String[] args) {
        

        try{
            int []arr = new int[10];

            
            int number = 100/0;


        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        


    }
}
