package OOPs2.Encapsulation.example2;

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
