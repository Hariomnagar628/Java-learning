package OOPs;

public class Constructor {
    
    public static void main(String[] args) {
          
         CreateConstructor obj  = new CreateConstructor();
         obj.print();

        }

}


class CreateConstructor{    
    
    int a,b;

 
    //Constructor 
    public CreateConstructor()
      {
        a=5;
        b=8;

        System.out.println("Constructor is created");
      }



    void print()
    {
        System.out.println(a + " " + b);

    }

}

