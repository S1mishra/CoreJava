package MultithreadingAndConcurrency.RaceConditionWithSynchronization;

public class HandledRaceCondition {

    public static void main(String[] args) throws InterruptedException{
        Counter counter = new Counter();

    Thread t1 = new Thread(() -> {
        for(int i = 0; i < 100000; i++){
            counter.increment();
        }
    });

    Thread t2 = new Thread(() -> {
        for(int i=0; i< 100000; i++){
            counter.increment();
        }
    });

    t1.start();
    t2.start();

    /*The join() method causes the calling thread to wait until the thread it's invoked on completes execution.
    The main thread pauses after starting t1 and t2
    It waits for both threads to complete their 100,000 increment operations
    Only after both threads finish does it print the final count
    */
    
    t1.join();
    t2.join();

    System.out.println("Final count: " + counter.count);

    /*
    Without join(), the main thread would print the count immediately (likely before the worker 
    threads finish), giving an incorrect result. With join(), you ensure all threads complete 
    their work before proceeding, which is why the synchronized counter produces the correct 
    result of 200,000.
     */

    }
}
