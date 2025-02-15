import java.util.*;
public class Pattern2 {
    public static void nForest(int n) {
        // Write your code here
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
               System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       nForest(n);
    }
           
}