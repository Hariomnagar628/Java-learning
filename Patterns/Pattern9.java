import java.util.*;
public class Pattern9 {

    public static void pattern9(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(char j='A';j<='A'+(n-i-1);j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       System.out.println("Enter the size");
       Scanner input = new Scanner(System.in);
       int size = input.nextInt();
       pattern9(size);
    }
}
