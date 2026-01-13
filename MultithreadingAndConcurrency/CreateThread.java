package MultithreadingAndConcurrency;

//extend thread class
public class CreateThread extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args)
    {
        new CreateThread().start();
    }

}
