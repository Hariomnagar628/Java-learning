package Multithreading.ThreadMethods;


class function extends Thread{

    
     @Override
     // run() method 
    public void run()
    {
        System.out.println("Thread is Running....");
        
    }

}


public class Start {

    public static void main(String[] args) {

        
        function obj = new function();
       
        // Start() method
        obj.start();



    }

}


