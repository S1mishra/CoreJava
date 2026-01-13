package MultithreadingAndConcurrency;

//Print numbers using two threads (Odd/Even) 
/*
Concepts:
Thread creation
Synchronization
Two threads share a common monitor object.
Using synchronized, wait, and notify, threads coordinate to print numbers in sequence.
“Threads may wake up for no reason. Your code must handle it.” = Spurious wakeups -> Always use while to avoid spurious wakeups. (conditionis checked again and again unlike if)
“while ensures condition is rechecked after waking up.”
Official java doc: A thread can wake up without being notified, interrupted, or timing out.
 */

public class NumberPrinter{
    private int number = 1;
    private final int MAX = 10;
    
    public static void main(String[] args){
        NumberPrinter printer = new NumberPrinter();
        Thread oddThread = new Thread(() -> printer.printOdd());
        Thread evenThread = new Thread(() -> printer.printEven());

        oddThread.start();
        evenThread.start();
    }

    //Method to print odd numbers
    public synchronized void printOdd(){
        while(number <= MAX){
            if(number % 2 == 0){
                try{
                    wait(); //not my turn -> Calling wait() outside synchronized -> Throws IllegalMonitorStateException.
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }else{
                System.out.println("Odd thread: " + number);
                number++;
                notify(); //make even thread -> If forgot : Threads will wait forever → deadlock-like situation.
            }
        }
    }

    //Method to print even numbers
    public synchronized void printEven(){
        while(number <= MAX){
            if(number % 2 != 0){
                try{
                    wait();
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }else{
                System.out.println("Even thread: " + number);
                number++;
                notify(); //wakeup odd thread
            }
        }
    }
}
