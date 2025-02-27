package OOPs3.Enuminjava;


// In Java, enum types are considered to be a special type of class. It was introduced with the release of Java 5.

// An enum class can include methods and fields just like regular classes.

enum Size{

    SMALL,
    LARGE,
    MEDIUM;

    public String getsize()
    {

            switch(this)
            {
                case SMALL:
               return "small";
            

            case MEDIUM:
            return "medium";

            case LARGE:
            return "large";

            default:
            return null;
    
    
            }

}

}

public class Java_EnumClass {
    public static void main(String[] args) {
        
        System.out.println(Size.SMALL.getsize());

    }
  
    
}
