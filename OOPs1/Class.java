package OOPs1;
public class Class {
    public static void main(String[] args) {


        Dog d1 = new Dog();  //Creating object of class Dog
         
        d1.name="Tommy";
        d1.bark();
        d1.walk();

        Dog d2 = new Dog();
         
        d2.name = "Leo";
        d2.bark();
        d2.walk();
    

    }
}

class Dog{

    String name;
    int age;
    String color;
    

    void bark()
    {
        System.out.println(name + " is barking");
    }

    void walk()
    {
        System.out.println(name+" is walking");
    }

}

