package OOPs2.Inheritance;


class Animal{

  
     Animal()

     {
        System.out.println("I am an animal");
     }

}

class Dog extends Animal{


   Dog()
   {
      super();
      System.out.println("I am a dog");
   }
      


}

public class Superkeyword2 {
   
    public static void main(String[] args) {
         
         Dog obj = new Dog();  


    }

}
