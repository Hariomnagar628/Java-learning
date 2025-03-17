package Multithreading.Notes;

// when java program Starts, one thread begin running imediately, which is called the main thread.This thread is responsible for executing the main method of a program.


// To create a new thread in java you can either extend the thread class or impliment the runneble interface.

// First way of creating thred in java 

class THread extends Thread{

    public void run()
    {
        
        System.out.println(Thread.currentThread().getName());
        System.out.println("World");
    }

}




public class Threaddemo {

       public static void main(String[] args) {
        
        THread obj = new THread();
        obj.start();

       System.out.println(Thread.currentThread().getName());
       System.out.println("Hello");
       


    }


}


