package Multithreading.ThreadMethods;

class fun extends Thread{


    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
        {

            try{

            // sleep() method    
            Thread.sleep(1000);
            }

            catch(InterruptedException e){

                throw new RuntimeException(e);

            }
            System.out.println(i);

        }

    }


}


public class Sleep {

    

    public static void main(String[] args) throws InterruptedException {

        fun obj = new fun();
        obj.start();

        // join() method

        obj.join();
        System.out.println("called after 0 1 2 3 4");
        

    }

}
