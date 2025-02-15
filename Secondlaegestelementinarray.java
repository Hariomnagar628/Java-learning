import java.util.*;
public class Secondlaegestelementinarray{
           public static void main(String[] args) {
           int [] arr = {25,63,55,28,14};
           int largest=arr[0];
           int secondlarg = arr[0];
           for(int i=0;i<arr.length;i++)
           {
               if(largest<arr[i]) 

               {
                  largest=arr[i];
               }
           }  
            
            


           for(int i=0;i<arr.length;i++)
           {
            if(arr[i]<largest&&secondlarg<=arr[i])
            {
                 secondlarg=arr[i];
            }

           }
           
            System.out.println(secondlarg);

          }    


      }

