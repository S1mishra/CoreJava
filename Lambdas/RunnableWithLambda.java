public class RunnableWithLambda{
    public static void main(String[] args){
        Runnable r = () -> System.out.println("Hello, world!");
        new Thread(r).start();
    }
}