package Stringmethods;

public class Empty {
    public static void main(String[] args) {
        String name = "";
        String name1 = "  ";

        if(name.isEmpty())
        {
            System.out.println("the string is empty");
        }
        else{
            System.out.println("string is not empty");
        }


         if(name1.isBlank())
         {
            System.out.println("blank");
         }
         else{
            System.out.println("Not blank");
         } 
    }

}
