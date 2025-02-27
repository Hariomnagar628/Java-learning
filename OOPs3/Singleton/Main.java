package OOPs3.Singleton;

class Database{


    private static Database dbobj;

    private Database()
    {

    }

    public static Database getInstance()
    {


        if(dbobj==null)
        {
            dbobj = new Database();
        }

        return dbobj;

    }

    public void getConnection()
    {
        System.out.println("You are know connected to database");
    }


}


public class Main {

    public static void main(String[] args) {
        
    
    Database db1;

    db1=Database.getInstance();
    db1.getConnection();
    

}


}

