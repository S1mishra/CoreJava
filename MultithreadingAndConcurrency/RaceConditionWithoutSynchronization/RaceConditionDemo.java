package MultithreadingAndConcurrency.RaceConditionWithoutSynchronization;

public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException{
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 100000; i++){
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 100000; i++){
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.count);

        /*Each time we will get different value when run -> race condition
        Reason: count++ is NOT one operation.
        It breaks into 3 steps:
        Read count
        Increment
        Write back

        Two threads overlap -> 
        Thread 1 reads 10
        Thread 2 reads 10
        Thread 1 writes 11
        Thread 2 writes 11 (lost update)
        */
        

    }
    
}
