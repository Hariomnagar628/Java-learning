import java.util.Scanner;
public class Pattern8 {
    
        public static void nLetterTriangle(int n) {
            // Write your code here
            for(int i=0;i<=n;i++)
            {
                for(char j=65;j<65+i;j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args)
        {
            java.util.Scanner input = new Scanner(System.in);
            int size = input.nextInt();
            nLetterTriangle(size);
        }
    }
    



