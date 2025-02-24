package OOPs2.Inheritance;

//Implementing Abstract Methods

//If the abstract class includes any abstract method, then all the child classes inherited from the abstract superclass must provide the implementation of the abstract method. For example,


abstract class Animal{

   abstract void makesound();
   public void eat()
   {
    System.out.println("I can eat");
   }


}



class Dog extends Animal{

public void makesound()
{
    System.out.println("Bow Bow");
}


}

public class Abstractclass1 {
    

    public static void main(String[] args) {
        
            Dog obj = new Dog();
            obj.makesound();
            obj.eat();


    }




}
