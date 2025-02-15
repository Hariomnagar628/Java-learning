abstract class animal{
    public abstract void animalsound();

    public void sleep()
    {
        System.out.println("Zzz");
    }

}

class Pig extends animal{
    public void animalsound()
    {
        System.out.println("the pig says : wee wee ");
    }
}

public class Abstraction {
   public static void main(String[] args) {
    Pig mypig=new Pig();
    mypig.animalsound();
    mypig.sleep();
   }    

}
