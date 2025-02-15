import java.io.File;

public class Deletefile {
public static void main(String[] args)
{
    File myobj = new File("newfile.txt");
    if(myobj.delete())
    {
        System.out.println("File is succesfully deleted");
    }
    else
     {
        System.out.println("Failed to delete file");
    }
}    
}
 