package Java_Exception_Handling.throw_and_throws_keyword;


class function{

int arr[] = new int[10];


public void writelist()
{
    try{
        arr[10] = 11;  
    }
    catch(NumberFormatException e1)
    {
        System.out.println("NumeberformatException"+e1.getMessage());
    }
    catch(IndexOutOfBoundsException e2)
    {
        System.out.println("IndexoutofbondException "+e2.getMessage());
    }
}

}


public class MultipleCatch {
    
public static void main(String[] args) {
  
    
    function obj = new function();
      obj.writelist(); 



}


}
