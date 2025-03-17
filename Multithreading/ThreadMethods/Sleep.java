package Multithreading.ThreadMethods;

class fun extends Thread{


    @Override

    // run() method
    // Entry point of thread code
    public void run()
    {
        for(int i=0;i<5;i++)
        {

            try{

            // sleep() method   
            // Pause thread for milliseconds 
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
        // start() method 
        // Starts the thread (calls run() internally)
        obj.start();

        // join() method
        // Wait for another thread to finish
        obj.join();
        System.out.println("called");
        

    }

}
