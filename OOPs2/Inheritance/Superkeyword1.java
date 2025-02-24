package OOPs2.Inheritance;  

// 2. Access Attributes of the Superclass
// The superclass and subclass can have attributes with the same name. We use the super keyword to access the attribute of the superclass. 

class Animal {
    protected String type = "Animal";
}

class Dog extends Animal {
    public String type = "Mammal";

    public void printtype() {
        System.out.println("I am a " + type);       // Refers to Dog's type
        System.out.println("I am a " + super.type); // Refers to Animal's type
    }
}

public class Superkeyword1 {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.printtype();
    }
}
