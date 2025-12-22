//Using a class
public class ImplementingRunnableInterface implements Runnable{
    @Override
    public void run(){
        System.out.println("Task running!");
    }

    public static void main(String[] args){
        Runnable r = new ImplementingRunnableInterface();
        new Thread(r).start();
    }
}
//Using lambda expression
/*
Runnable r = () -> System.out.println("Task running!");
new Thread(r).start();
*/