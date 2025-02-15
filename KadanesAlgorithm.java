//MaimumSubarray

public class KadanesAlgorithm {
  
    public static void main(String[] args) {
         int [] arr = {-1,2,-1,4,5,6};

       int maxsum = arr[0];
          
          int sum=0;
          
         for(int i=0;i<arr.length;i++)
         {

              sum=sum+arr[i];
              
              if(sum<0)
              {
                sum=0;
              }
             
               if(sum>maxsum)
               {
                maxsum=sum;
               }

            
           

         }



         System.out.println(sum);
    }

}
