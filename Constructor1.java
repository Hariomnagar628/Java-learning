public class Constructor1 {
    int modelyear;
    String modelname;
    public Constructor1(int year,String name)
    {
         modelyear=year;
         modelname=name;
    }
    public static void main(String[] args)
    {
        Constructor1 myobj= new Constructor1(1969, "mustang");
        System.out.println(myobj.modelyear+" "+myobj.modelname);      

    }
    
}
