public class rotatematrix {
    
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9},{2,3,5}};
        int [][] rotarr = new int[arr.length][arr.length];
         int n=arr.length;

         System.out.println(n);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                  System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }


        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                rotarr[j][n-i-1]=arr[i][j];
          }
        }
  
         System.out.println();

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                  System.out.print(" "+rotarr[i][j]);
            }
            System.out.println();
        }
    }
}
