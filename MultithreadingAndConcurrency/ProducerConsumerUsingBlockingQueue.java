package MultithreadingAndConcurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerUsingBlockingQueue {
    public static void main(String[] args){
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Runnable producer = () -> {
            int value = 1;
            try{
                while(value <= 5){
                    queue.put(value);
                    System.out.println("Produced: " + value++);
                }
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        };

        Runnable consumer = () -> {
            try{
                while(true){
                    System.out.println("Consumed: " + queue.take());
                }

            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        };

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
