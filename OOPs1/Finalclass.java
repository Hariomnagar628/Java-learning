package OOPs1;


// In Java, the final class cannot be inherited by another class. For example,



final class fun{

    public  void display()
    {
        System.out.println("Final class");

    }


}


class Finalclass extends fun {
    
         public void display()
         {
            System.out.println("Method can be overridden");
         }


    public static void main(String[] args) {
        

    Finalclass obj = new Finalclass();
    obj.display();


     


    }



}
