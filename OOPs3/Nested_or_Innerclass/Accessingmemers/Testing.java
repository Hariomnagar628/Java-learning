package OOPs3.Nested_or_Innerclass.Accessingmemers;


class Car{


    String carname;
    String cartype;

    public Car(String carname,String cartype)
    {

         this.carname = carname;
         this.cartype = cartype;

    }


    private String getcarname()
    {

        return this.carname;
    }


    class Engine{


        String enginetype;


    void setengine()
        {


            if(Car.this.cartype.equals("$WD"))
            {

                if(Car.this.getcarname().equals("crysler"))
                {

                    this.enginetype = "Smaller";

                }
                else{

                    this.enginetype = "Bigger";
                }
            }
            else{


                this.enginetype = "Bigger";
           
            }


        }

        String getengintype()
        {

            return this.enginetype;
        }

    }
    
}


public class Testing {

    public static void main(String[] args) {
        
    

    Car car = new Car("Mazda", "8WD");


    Car.Engine engine = car.new Engine();

    
    engine.setengine();

    System.out.println("Engine type for 8WD"+engine.getengintype());


    Car car2 = new Car("crysler", "4WD");
    Car.Engine c2engine = car2.new Engine();

    c2engine.setengine();
    System.out.println(c2engine.getengintype());
    
    }

}
