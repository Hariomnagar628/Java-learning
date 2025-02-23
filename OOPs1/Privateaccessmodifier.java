package OOPs1;

// we can use the getter and setter methods to set the values and get the values for private members.

//Note: We cannot declare classes and interfaces private in Java. However, the nested classes can be declared private. 

class Private{
   private String name;


      public void setter(String name)
      {
        this.name = name;

      }

      public void getter()
      {
        System.out.println("Name: "+name);
      }




}



public class Privateaccessmodifier {
    
    public static void main(String[] args) {


       Private obj = new Private();
       obj.setter("Hariom");
       obj.getter();
      
    }
}
