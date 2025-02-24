package OOPs2.Inheritance;

// The super keyword in Java is used in subclasses to access superclass members (attributes, constructors and methods).


// 1.To call methods of the superclass that is overridden in the subclass.
// 2.To access attributes (fields) of the superclass if both superclass and subclass have attributes with the same name.
// 3.To explicitly call superclass no-arg (default) or parameterized constructor from the subclass constructor.



// Example 2: super to Call Superclass Method



class Animal{

   public void display()
    {
         
        System.out.println("I am animal");

    }
}



class Dog extends Animal{


    public void display()
    {
        System.out.println("I am dog");
    }




public void printmessage()
{

    display();
    super.display();


}

}

public class Superkeyword {
 
    
    public static void main(String[] args) {

          Dog dog1 = new Dog();
         dog1.printmessage();

        
    }
}
