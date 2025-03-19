package Annotation;

class function
{

    public  void hello()
    {
        System.out.println("In function class");
    }

}

class newfunction extends function{

       @Override
    public void hello()
    {
        System.out.println("Inside newfunction class");
    }
}


public class Annonation1 {
    
   
       public static void main(String[] args) {
        

      newfunction obj = new newfunction();
      obj.hello();  


    }

}
