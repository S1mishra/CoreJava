package MultithreadingAndConcurrency;

public class ImplementRunnable implements Runnable{
    public void run(){
        System.out.println("Thread running");
    }

    public static void main(String[] args){
        new Thread(new ImplementRunnable()).start();
        //Never call run() directly -> it is just a method call
        //always use start() -> it creates a new thread
    }
    
}
