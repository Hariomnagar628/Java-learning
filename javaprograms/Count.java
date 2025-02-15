public class Count {
public static void main(String[] args) {
    String name = "Hello Iam Java";
    String[] array = name.split("\\s");
    for(String i:array)
    {
        System.out.println(i);
    }
    int size = name.split("\\s").length;
    System.out.println(size);

}
     
}   