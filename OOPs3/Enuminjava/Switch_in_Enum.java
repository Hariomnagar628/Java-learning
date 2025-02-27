
package OOPs3.Enuminjava;


enum Size{
    
    SMALL,
    LARGE,
    MEDIUM,
    EXTRALARGE

}

class Test{
    Size pizzasize;

   public Test(Size pizzasize)
   {
    this.pizzasize = pizzasize;

   }

   public void orderpizze(){
    switch (pizzasize) {
        case SMALL:
            
            System.out.println("I ordered small pizza");
            break;

        case MEDIUM:
        System.out.println("i ordered medium pizza");
    
        case LARGE:
        System.out.println("i ordered large pizza");

        case EXTRALARGE:
        System.out.println("i ordered extralarge");
        default:
        System.out.println("i don't know which one to order");
            break;
    }
   }



}


public class Switch_in_Enum {

    public static void main(String[] args) {

        Test obj = new Test(Size.LARGE);
        obj.orderpizze();

        
    }


}
