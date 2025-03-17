package Multithreading.ThreadMethods;


class hello extends Thread{

    @Override
    // run() method
    public void run()
    {
        System.out.println("Thread is Running....");
    }


}


public class Run {
    
    public static void main(String[] args) {
        

        hello obj = new hello();
        obj.start();


    }


}
