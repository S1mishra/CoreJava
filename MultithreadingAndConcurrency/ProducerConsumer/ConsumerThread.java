package MultithreadingAndConcurrency.ProducerConsumer;

public class ConsumerThread implements Runnable{

    private SharedBuffer buffer;

    ConsumerThread(SharedBuffer sharedBuffer){
        this.buffer = sharedBuffer;
    }

    @Override
    public void run(){
        try{
            while(true){
                buffer.consume();
                Thread.sleep(800);
            }
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
