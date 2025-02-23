package OOPs1;

class Main
{

      int value;


    Main(int value)
    {

         this.value = value;
         System.out.println("this refrence -->"+this);

    }
      


}


public class This1 {
    
    public static void main(String[] args) {
        

        Main obj = new Main(8);
        System.out.println("object refrence-->"+obj);    
    }

}
