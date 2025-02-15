public class Classmethods {
    
    static void staticmethod()
    {
        System.out.println("This method is called without creating a object");
    }

    public void publicmethod()
    {
        System.out.println("This method is calles by creating a object");
    }

    public static void main(String[] args)
    {
           
           Classmethods myobj=new Classmethods();  
           myobj.staticmethod();
    }
    
}
