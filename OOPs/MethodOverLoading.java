// Function(Method) overloading -> The functoin have the same name but different in arguments. if the function have same name but diffrent in return type then  it is not a Function OverLoading Ex.--> void greet(); , int greet(); . 


package OOPs;

public class MethodOverLoading {
    
    public static void main(String[] args) {
     
        Greet obj1 = new Greet();
        obj1.Greeting();
        obj1.Greeting("Hariom");
        obj1.Greeting(2,"hello");
    }
}

class Greet{

    void Greeting()
    {
        System.out.println("Hello,Good Morning");
    }

    void Greeting(String name)
    {
        System.out.println("Hello " + name + ", Good Morning ");
    }

    void Greeting(int num,String name)
    {
        System.out.println(num+name);
    }
}