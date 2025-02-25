package OOPs3.AnonymousClass;

// Example 2: Anonymous Class Implementing an Interface

interface Polygon{

    public void display();
}

class Anonymous{

    public void createclass()
    {
 
        // anonymous class implementing interface

        Polygon obj = new Polygon() {
            
            public void display()
            {
                System.out.println("inside anonymouse class");
            }
        };

        obj.display();
    }
}


public class Maintest {

    public static void main(String[] args) {
        
        Anonymous p1 = new Anonymous();
        p1.createclass(); 
    }
}
