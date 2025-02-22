import java.util.*;
public class Pattern7 {
    public static void nNumberTriangle(int n) {

        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
              System.out.print(num+" ");
              num=num+1;
            
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      int size = input.nextInt();
      nNumberTriangle(size);
    }
}