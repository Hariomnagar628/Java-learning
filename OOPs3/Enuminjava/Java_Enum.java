package OOPs3.Enuminjava;


// In Java, an enum (short for enumeration) is a type that has a fixed set of constant values. We use the enum keyword to declare enums. For example,


enum Size{

    SMALL,
    MEDIUM,
    LARGE,
    EXTRALARGE

}


public class Java_Enum {
    
    public static void main(String[] args) {
        

        System.out.println(Size.SMALL);
        System.out.println(Size.MEDIUM);
        System.out.println(Size.LARGE);
        System.out.println(Size.EXTRALARGE);
    }

}
