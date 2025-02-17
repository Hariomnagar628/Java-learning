public class Sumarray{
    public static void main(String[] args) {
        int sum=0;
        int[] array = {23,54,698,54,23};
        for(int i=0;i<array.length;i++)
        {
            sum=sum+array[i];
        }
          System.out.println(sum);
    }
}