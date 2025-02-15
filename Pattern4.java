import java.util.*;
public class Pattern4 {
    public static void pattern4(int n)
    {
     
         for(int i=1;i<=n;i++)
         {
            for(int j=1;j<=i;j++)
            {
              System.out.print(i+" ");
            }
            System.out.println();
         }

    }
    public static void main(String[] args)
    {
        System.out.println("Enter the size");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        pattern4(size);
    }
       
    
}