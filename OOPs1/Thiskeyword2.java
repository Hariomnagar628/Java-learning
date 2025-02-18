package OOPs1;

// 2. Calling Another Constructor (Constructor Chaining)

// The this keyword can be used to call another constructor in the same class.


class Student1{

     String name;
     int age;

    Student1(String name)
    {
         
        this(name,23);

    }

    Student1(String name,int age)
    {

          this.name = name;
          this.age = age;

    }

    void Display()
    {
        System.out.println(name+","+age);
    }
}





public class Thiskeyword2 {
    

     public static void main(String [] args)
     {

        Student1 s1 = new Student1("Hariom");
        s1.Display();

     }
}





