package Java_Exception_Handling.throw_and_throws_keyword;


// . Java throw and throws keyword
// The Java throw keyword is used to explicitly throw a single exception.

// When we throw an exception, the flow of the program moves from the try block to the catch block.



public class Throw {
    

    public static void dividebyzero()
    {
       throw new ArithmeticException("Trying to divide by 0");
    }
public static void main(String[] args) {
    


       dividebyzero();

}
    
}
