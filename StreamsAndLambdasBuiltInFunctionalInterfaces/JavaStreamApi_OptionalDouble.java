import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class JavaStreamApi_OptionalDouble {
    public static void main(String[] args){
        IntStream isl = IntStream.of(1,3,5);
        OptionalDouble ops = isl.filter(i  -> i%2 ==0).average();  
        System.out.println(ops);  
        //output = OptionalDouble.empty

        IntStream isl2 = IntStream.of(2,4,6);
        int x = isl2.filter(i -> i%2 != 0).sum();
        System.out.println(x);  
        //output = 0
    }
    
}

//Explation: Why different outputs?
//In the first case, the IntStream contains only odd numbers (1, 3, 5). 
// When we apply the filter to select even numbers (i % 2 == 0), 
// there are no elements that satisfy this condition. As a result, 
// the filtered stream is empty. When we then call average() on this 
// empty stream, it returns an OptionalDouble.empty(), indicating that 
// there is no average value to compute.

//In the second case, the IntStream contains only even numbers (2, 4, 6).
// When we apply the filter to select odd numbers (i % 2 != 0), again, 
// there are no elements that satisfy this condition. The filtered 
// stream is empty. However, when we call sum() on this empty stream, 
// it returns 0 because the sum of no elements is defined to be 0 in 
// this context. Hence, the output is 0.
