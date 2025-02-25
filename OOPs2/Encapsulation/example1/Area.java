package OOPs2.Encapsulation.example1;


// Encapsulation is one of the key features of object-oriented programming. Encapsulation refers to the bundling of fields and methods inside a single class.

// It prevents outer classes from accessing and changing fields and methods of a class. This also helps to achieve data hiding.


// In this example, we have created a class named Area. The main purpose of this class is to calculate the area.

// To calculate an area, we need two variables: length and breadth and a method: getArea(). Hence, we bundled these fields and methods inside a single class.

// Here, the fields and methods can be accessed from other classes as well. Hence, this is not data hiding.




public class Area {


    int length;
    int breadth;

    Area(int length,int breadth)
    {

    this.length = length;
    this.breadth = breadth;
    
}

public void getArea()
{
    int area = length*breadth;
    System.out.println("Area "+ area);
}    

}
