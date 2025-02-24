package OOPs2.Multipleinheritance;

public class Smartphone  implements Musicplayer,Phone,Camera{

public void playmusic()
{

    System.out.println("Play music");
}


public void stopmusic()
{
    System.out.println("stop music");

}


public void start()
{

    System.out.println("start phone");

}


public void stop()

{

System.out.println("stop phone");

}

public void takephoto()
{
     
    System.out.println("take photo");

}

public void recover()
{

    System.out.println("recover photo");
}

}