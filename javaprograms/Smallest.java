public class Smallest {
 public static void main(String[] args) {
    int[] arr = {43,5,65,7,98,43,21};
     int newarr=arr[0];
     for(int i:arr)
     {
        if(newarr>i)
        {
            newarr=i;
        }

     }
     System.out.println(newarr);
 }   

}
