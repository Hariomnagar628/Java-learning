package Multithreading.Synchronization;

public class Counter {

    private int count=0;
    
    // if i removed the synchronized keyword between -- public synchronized void increment() -- then it will print random number's


    public synchronized void  increment()
    {

        // Block of code will be synchronized 
        // Called synchronized block 
        synchronized(this)
        {
        count++;
        }
    }
     
    public int getcount()
    {
        return count;
    }
   

}
