import java.util.*;
public class Pattern5 {
       
    public static void pattern5(int size)
    {
        for(int i=0;i<size;i++)
        {
            for(int j=size;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        pattern5(size);
    }
}