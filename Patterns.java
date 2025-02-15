import java.util.*;
public class Patterns{

  static void pattern1(int n)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<=i;j++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern2(int n)
  {
      for(int row=0;row<n;row++)
      {
        for(int col=row;col<n;col++)
        {
            System.out.print("* ");
        }
        System.out.println();
      }
  }

  
  static void pattern3(int n)
  {
    for(int i=1;i<=n;i++)
    {

      for(int j=1;j<=i;j++)
      {
          System.out.print(j+" "); 
      }
      System.out.println();
    }
  }


  static void pattern4(int n)
  {
   int num;
    for(int i=0;i<2*n;i++)
    {
       if(i>n)
       {
        num=2*n-i;
       }
       else{
        num=i;
       }
      

      for(int j=0;j<num;j++)
      {
        System.out.print("* ");

      }

      System.out.println();
    }
   
  }

  static void pattern5(int n)
  {
   
    for (int i = 1; i <= n; i++) {
     
      for (int j = 1; j <= n; j++) {
          if (j <= n - i) {
              
              System.out.print("  ");
          } else {
              
              System.out.print("* ");
          }
      }
      System.out.println(); 
  }
  }

 


  public static void main(String[] args) {
    // pattern1(5);
    // System.out.println();
    // pattern2(5);
    // System.out.println();
    // pattern3(5);
    // System.out.println();
    // pattern4(5);
    // System.out.println();
    pattern5(5);
    System.out.println();
       
      
     
      
      
    }
   }
   

   

