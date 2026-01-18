package MultithreadingAndConcurrency.ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
    private Queue<Integer> queue = new LinkedList<>();
    private final int CAPACITY = 5;

    public synchronized void produce(int value) throws InterruptedException{
        while(queue.size() == CAPACITY){
            wait(); //buffer full
        }

        queue.add(value);
        System.out.println("Produced: " + value);

        notify(); //wake consumer
    }

    public synchronized int consume() throws InterruptedException{
        while(queue.isEmpty()){
            wait(); //buffer empty
        }

        int value = queue.poll();
        System.out.println("Consumed: " + value);

        notify(); //wake producer

        return value;
    }
}
