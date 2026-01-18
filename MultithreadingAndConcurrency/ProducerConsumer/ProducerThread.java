package MultithreadingAndConcurrency.ProducerConsumer;

public class ProducerThread implements Runnable{

    private SharedBuffer buffer;

    ProducerThread(SharedBuffer sharedBuffer){
        this.buffer = sharedBuffer;
    }

    @Override
    public void run() {
        int value = 1;
        try{
            while(true){
                buffer.produce(value++);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();

        }
    }
}
