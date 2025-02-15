public class Abstract1 {
    
    public static void main(String[] args)
    {
        Student myobj=new Student();
        System.out.println("name "+myobj.fname);
        System.out.println("age "+myobj.age);
        System.out.println("Graduation year "+myobj.graduatinYear);
        myobj.study();
    }
}
