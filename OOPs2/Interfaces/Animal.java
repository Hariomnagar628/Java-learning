package OOPs2.Interfaces;

public interface Animal {


     int age=150;

    void eat();
    void sleep();


    public static void information()
    {

        System.out.println("This is an animal interface");

    }


    public default void run()
    {
        this.eat();
        System.out.println("Animal is   running");
     
    }
        
} 