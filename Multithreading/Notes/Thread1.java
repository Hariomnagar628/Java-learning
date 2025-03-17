package Multithreading.Notes;

// Second way of creating thread in java


// To create a thread in java ,you can either extends the thread class or impliment the runnable interface.



class demo implements Runnable {

        public void run()
        {
            System.out.println(Thread.currentThread().getName());
        }

}


public class Thread1 {
    


    public static void main(String[] args) {
        


 
           demo obj = new demo();
           
           Thread t1 = new Thread(obj); 
           t1.start();

           System.out.println(Thread.currentThread().getName());


    }



}
