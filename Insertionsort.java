import java.util.*;
public class Insertionsort {
    public static void main(String[] args) {
      int[] arr = {23,2,3,423,21,43,54,67,4};
      for(int i=0;i<=arr.length-1;i++)
      {
        int j=i;
        while(j>0 && arr[j-1]>arr[j])
        {
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--; 
        }
      }   
    for(int i:arr)
    {
        System.out.print(" " + i);
    }
       
       
    }
}
