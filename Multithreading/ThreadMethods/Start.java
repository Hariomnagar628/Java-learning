package Multithreading.ThreadMethods;


class hello extends Thread{

    
     @Override
     
    public void run()
    {
        System.out.println("Thread is Running.......");
    }

}


public class Start {

    public static void main(String[] args) {

        
        hello obj = new hello();
       
        // Start() method
        obj.start();



    }

}


