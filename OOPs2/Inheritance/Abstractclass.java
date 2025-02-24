package OOPs2.Inheritance;

//Example: Java Abstract Class and Method


abstract class Language{
 
    
    public void display()
    {
        System.out.println("This is java programming");

    }
    
}




 class Abstractclass extends Language {
 
    public static void main(String[] args) {

        Abstractclass obj = new Abstractclass();
        obj.display();
        
    }

   

}
