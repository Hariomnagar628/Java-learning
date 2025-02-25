package OOPs3.Nested_or_Innerclass;


// Non-Static Nested Class (Inner Class)

// A non-static nested class is a class within another class. It has access to members of the enclosing class (outer class). It is commonly known as inner class.

// Since the inner class exists within the outer class, you must instantiate the outer class first, in order to instantiate the inner class.


class CPU{

double price;

class Processor{


    double cores;
    String manufecturer;

    double getcache()
    {
        return 4.3;
    }

}


protected class RAM{


    double memory;
    String manufecturer;


    double getclockspeed()
    {
        return 5.5;

    }

}

}


public class Main {
    
public static void main(String[] args) {
    

    CPU cpu = new CPU();
    
    CPU.Processor processor = cpu.new Processor();


    CPU.RAM ram = cpu.new RAM();

    System.out.println("Processor cache = " + processor.getcache());
    System.out.println("Ram clock Speed = " + ram.getclockspeed());

}

}
