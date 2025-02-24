package OOPs2.Interfaces;

public class Test {
    
public static void main(String[] args) {
    
    Dog dog = new Dog();
    dog.eat();  

    Cat cat = new Cat();
    cat.eat(); 

    System.out.println(dog.age);
   

    Animal.information();
    dog.run();
    

}

}
