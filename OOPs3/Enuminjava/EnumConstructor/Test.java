package OOPs3.Enuminjava.EnumConstructor;

// In Java, an enum class may include a constructor like a regular class. These enum constructors are either

// private - accessible within the class
// or
// package-private - accessible within the package





enum Size{

     SMALL("THE PIZZA IS SMALL"),
     LARGE("THE PIZZA IS LARGE"),;     



    private final String pizzasize;

    private Size(String pizzasize)
    {
        this.pizzasize = pizzasize;

    }

    public String getsize()
        {


            return pizzasize;
      
        }
    



}



public class Test {

    public static void main(String[] args) {
        
        Size size = Size.SMALL;
        System.out.println(size.getsize());
    }
    
}
