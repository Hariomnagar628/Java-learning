package OOPs2.Inheritance;

abstract class MoterBike{
    abstract void Break();

}

class Sportbike extends MoterBike{

    public void Break()
    {
        System.out.println("sport bike break");
    }
}

class Mountanbike extends MoterBike{

    public void Break()
    {

        System.out.println("Mountanbike break");
    }
}

public class Abstractclass2 {
    

    public static void main(String[] args) {


          Mountanbike obj = new Mountanbike();
          obj.Break();
          
          Sportbike obj1 = new Sportbike();
          obj1  .Break();
        
    }
}
