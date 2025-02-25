package OOPs2.Overriding;

public class Child  extends Parent{
    
    void walk()
    {
        System.out.println("Children is walk");
    }



    public static void main(String[] args) {
        
        Child obj = new Child();
        obj.walk();

        Parent obj1 =  new Parent();
        obj1.walk();

       
    }
}
