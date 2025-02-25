package OOPs2.Polymorphism.Polymorphicvariables;

// A variable is called polymorphic if it refers to different values under different conditions.

// Object variables (instance variables) represent the behavior of polymorphic variables in Java. It is because object variables of a class can refer to objects of its class as well as objects of its subclasses.

public class Main {

    public static void main(String[] args) {
         
    Programminglanguage obj;


    obj = new Programminglanguage();
    obj.display();


     obj = new Java();
     
    obj.display();
     
     

    }
    

}


