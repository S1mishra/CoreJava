package MultithreadingAndConcurrency.ProducerConsumer;

public class ProducerConsumerDemo {
    public static void main(String[] args){
        SharedBuffer buffer = new SharedBuffer();

        Thread producer = new Thread(new ProducerThread(buffer));
        Thread consumer =new Thread(new ConsumerThread(buffer));

        producer.start();
        consumer.start();
    }
    
}
