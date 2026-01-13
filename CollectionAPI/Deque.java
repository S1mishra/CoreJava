package CollectionAPI;

import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args){
        java.util.Deque<Integer> deque = new ArrayDeque<>();
        //if using push() and pop() methods, the deque works as a stack (LIFO)
        deque.push(1);
        deque.push(2);
        deque.push(3);

        System.out.println("Elements in Deque (as stack): "+ deque);

        
        deque.addFirst(4); //adds element at the front
        System.out.println(deque);

        deque.offerLast(5); //adds element at the end
        System.out.println(deque);
    }
    
}
