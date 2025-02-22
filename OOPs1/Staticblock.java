package OOPs1;



class block{

static int a = 23;
static int b ;
static int max; 

static {
    System.out.println("First static block");
    b = a*4;  
}

static {
    System.out.println("Second static block");
      max = 30;

}

public static void display()
{

    System.out.println("a = "+a);
    System.out.println("b = "+b);
    System.out.println("max = "+max);

}

}


public class Staticblock {
    
    public static void main(String[] args) {

        
        block.display();

    }
}
