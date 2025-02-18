package OOPs1;

// 1. Referring to Instance Variables
// this keyword is used to refer to the current object inside a method or a   constructor.




//  Referring to Instance Variables
//  When a method parameter has the same name as an instance variable, this is used to          differentiate between them.

// The constructor parameters (name and age) have the same names as the instance variables.
// this.name refers to the instance variable, while name refers to the parameter.


// If a parameter name matches an instance variable name, Java assumes you are referring to the parameter, not the instance variable.
// this is necessary to explicitly refer to the instance variable when there's a naming conflict.


class Student{

    String name;
    int age;

     Student(String name,int age)
    {

        this.name = name;
        this.age = age;


    } 

    void Display()
    {
        System.out.println("Name:"+name+", Age:"+age);
    }

}


public class Thiskeyword1 {
   
    public static void main(String[] args) {


         Student s1 = new Student("Hariom", 23);
         s1.Display();

        
    }

}





