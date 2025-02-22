import java.util.Scanner;
public class Pattern10 {
    
        public static void alphaRamp(int n) {

            char num = 'A'; 
            for(int i=0;i<n;i++)
            {
                for(char j=65;j<=65+i;j++)
                {
                    System.out.print(num+" ");
                 

                }
                num++;
                System.out.println();
            }
        }
    
        public static void main(String[] args)
        {
            java.util.Scanner input = new Scanner(System.in);
            int size = input.nextInt();
            alphaRamp(size);
        }
    }
    



