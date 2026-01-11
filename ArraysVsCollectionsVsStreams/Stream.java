package ArraysVsCollectionsVsStreams;

import java.util.Arrays;
import java.util.List;

/*
map(), filter(), reduce() are some common operations in streams.
*/
public class Stream {
    public static void main(String[] args){
        //Stream processes without modifying the original data source
        //Print only even numbers from an array
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);

        numbers.stream()
               .map(n -> n * n)
               .forEach(System.out::println);

        int sum = numbers.stream()
                         .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

    }
    
}
