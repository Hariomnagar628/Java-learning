package OOPs3.AnonymousClass;


// In Java, a class can contain another class known as nested class. It's possible to create a nested class without giving any name.

// A nested class that doesn't have any name is known as an anonymous class.

// An anonymous class must be defined inside another class. Hence, it is also known as an anonymous inner class. 



// Example 1: Anonymous Class Extending a Class

class Polygon{


    public void display()
    {
        System.out.println("Inside the Polygon class");
    }

}


class Anonymousdemo{


    public void createclass(){

        // creation of anonymous class extending class Polygon
        
        Polygon p1 = new Polygon(){

            public void display()
            {
                System.out.println("inside anonymoseclass");
            }
        };  

        p1.display();

    }

}

public class Main {
public static void main(String[] args) {

    Anonymousdemo obj = new Anonymousdemo();
    obj.createclass();
    
}

}
