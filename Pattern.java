import java.util.*;
public class Pattern{
     public static void NTimes(int n) {


            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print("* ");
     
                }
                    System.out.println();
            }
        }
        public static void main(String[] args)
        {
            int n;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the size");
            n = input.nextInt();  
             NTimes(n);
        }
    
}