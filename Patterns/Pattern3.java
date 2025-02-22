import java.util.Scanner;

public class Pattern3 {
      
    public static void pattern3(int n)
    {
     
         for(int i=0;i<=n;i++)
         {
            for(int j=1;j<=i;j++)
            {
              System.out.print(j+" ");
            }
            System.out.println();
         }

    }
    public static void main(String[] args)
    {
        System.out.println("Enter the size");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        pattern3(size);
    }
    
} 