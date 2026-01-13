package MultithreadingAndConcurrency.RaceConditionWithSynchronization;

public class Counter {
    int count = 0;

    synchronized void increment(){
        count++;
    }

    /*
    Another way - using synchronized block
    void increment(){
      synchronized(this){
        count++
      }
    }
    
    
    */
    
}
