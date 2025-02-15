public class Fibonacci {
          public static void main(String[] args)
          {
            int num1=0;
            int num2=1;
            int cur=0;
            for(int i=0;i<5;i++)
            {
                System.out.print( num1+" ");
                 cur = num1+num2;
                num1 = num2;
                num2 = cur;
                
            }
           

          }    
}
