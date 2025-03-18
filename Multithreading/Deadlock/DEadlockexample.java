package Multithreading.Deadlock;

class Pen{

public synchronized void writewithpenandpaper(Paper paper)
{
    System.out.println(Thread.currentThread().getName()+"is using pen"+this+" and trying to use paper");
    paper.finishwriting();

}
    

public synchronized void finishwriting()
{
    System.out.println(Thread.currentThread().getName()+"finishing using pen"+this);
}

}


class Paper{

    public synchronized void writewithpaperandpen(Pen pen)
    {

        System.out.println(Thread.currentThread().getName()+"is using "+this+"and trying to use pen");
        pen.finishwriting();
    }

    public synchronized void finishwriting()
    {
        System.out.println(Thread.currentThread().getName()+
        "finished using paper"+this);
    }
}


class Task1 implements Runnable{

    private Pen pen;
    private Paper paper;

    public Task1(Pen pen, Paper paper)
        {
            this.pen=pen;
            this.paper=paper;
    }

    @Override
    public void run()
    {
        pen.writewithpenandpaper(paper);// thread1 lockes pen and tries to lock paper
    }
    
}




class Task2 implements Runnable{


    private Pen pen;
    private Paper paper;

    public Task2(Pen pen, Paper paper)
        {
            this.pen=pen;
            this.paper=paper;
    }

   @Override
    public void run() {
      
      // That is resolve the deadlock 
        synchronized (pen){
          paper.writewithpaperandpen(pen); //Thread2 lockes paper and tries to lock pen 
        }
    }
}



public class DEadlockexample {
    

    public static void main(String[] args) {
        

        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread thread1 = new Thread(new Task1(pen, paper),"Thread1");
        Thread thread2 = new Thread(new Task2(pen, paper),"Thread2");

        thread1.start();
        thread2.start();

    }

}
