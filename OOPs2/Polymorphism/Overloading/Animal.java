package OOPs2.Polymorphism.Overloading;

public class Animal {
 
    
    public void eat()
    {
        System.out.println("animal are eat");
    }

    public void eat(String name)
    {
           System.out.println(name+"are eat");
    }

    public void eat(String name,int age)
    {
        System.out.println(name+"are eat. his age is"+age);
    }




    public static void main(String[] args) {
        

        Animal obj = new Animal();
        obj.eat();
        obj.eat("Elephent");
        obj.eat("Elephent",80);
    }



}
