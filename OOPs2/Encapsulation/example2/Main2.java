package OOPs2.Encapsulation.example2;


// Data hiding is a way of restricting the access of our data members by hiding the implementation details. Encapsulation also provides a way for data hiding.

// We can use access modifiers to achieve data hiding. For example,

// Example 2: Data hiding using the private specifier



class person{

    private int age;

    public int getage()
    {
          return age;
    }

    public void setage(int age)
    {

        this.age = age;

    }

}



public class Main2 {    
public static void main(String[] args) {
    
    person p1 = new person();
        p1.setage(23);
        System.out.println("Age = "+p1.getage());



}


}
