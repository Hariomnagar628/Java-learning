package OOPs1;

// In Java, the final method cannot be overridden by the child class. For example,


class fun
{

    public final void function ()
    {

          System.out.println("Final method is called");
    }


}




 class Finalmethod extends fun {
    
    public final void function()
    {
        System.out.println("the final methoed is ovwerridden");
    }

    public static void main(String[] args) {
         

        Finalmethod obj = new Finalmethod();
        obj.function();
    }

}
