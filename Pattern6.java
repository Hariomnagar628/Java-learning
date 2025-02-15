import java.util.*;
public class Pattern6 {
      
    public static void pattern6(int size){
        for(int i=0;i<size;i++)
        {
            for(int j=size;j>i;j--)
            {
                System.out.print(size-j+1+" ");
            }
            System.out.println();
        }
    }


     public static void main(String[] args) {
                   System.out.println("Enter the size ");
                   Scanner input = new Scanner(System.in);
                   int size = input.nextInt();
                   pattern6(size);        
     }
}
