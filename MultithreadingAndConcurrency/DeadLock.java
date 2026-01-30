package MultithreadingAndConcurrency;

//Deadlock occurs when threads wait indefinitely due to circular lock dependency; it can be prevented using lock ordering or tryLock.
public class DeadLock {
    private static final Object LOCK1 = new Object();
    private static final Object LOCK2 = new Object();

    public static void main(String[] args){
        Thread t1 = new Thread(() -> {
            synchronized(LOCK1){
                System.out.println("Thread 1 is holding LOCK1");
                sleep();
                synchronized(LOCK2){
                    System.out.println("Thread 1 is holding LOCK2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized(LOCK2){
                System.out.println("Thread 2 is holding LOCK2");
                sleep();
                synchronized(LOCK1){
                    System.out.println("Thread 2 is holding LOCK1");
                }
            }
        });

        t1.start();
        t2.start();
    }

    private static void sleep(){
        try{
            Thread.sleep(100);
        }catch(InterruptedException ignored){

        }
    }
}
