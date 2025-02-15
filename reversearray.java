public class reversearray{
    public static void main(String[] args) {
        int [] arr = {23,4,5,234,76,8,45};
          int start = 0;
          int end = arr.length-1;
          System.out.println(end);
          int temp=0;   
        while (start<=end)
            {
               temp=arr[start];
               arr[start]=arr[end];
               arr[end]=temp;
               start++;
               end--;
            } 
            for(int i:arr)
            {
                System.out.print(i+" ");
            }

    }
}