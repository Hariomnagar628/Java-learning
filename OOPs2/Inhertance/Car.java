package OOPs2.Inhertance;

public class Car  extends Vehical{
    
    public static void main(String[] args) {
        
        Car obj = new Car();
       
        obj.wheelcount=4;
        obj.start();
       
        System.out.println(obj.wheelcount);
        System.out.println(obj.Company);
    }
}
