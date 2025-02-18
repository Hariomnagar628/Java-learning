package OOPs1;

public class Constructor1 {

    public static void main(String[] args) {
        
        func  obj = new func();

        func obj1 = new func(2,4);
        obj1.print();
    


    }
}



class func
  {
  

    int a,b;



    //Constructor overloading

    //constructor
    public func()
    {
        System.out.println("iam constructor");
    }
 


    //constructor with parameter
    public func(int x,int y)
    {
        
      a=x;
      b=y;
         
        
    }

    void print()
    {
        System.out.println(a+b);
        
    }

 }

