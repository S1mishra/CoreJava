package ArraysVsCollectionsVsStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayCollectionStream {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        List<Integer> list = Arrays.stream(arr) // Convert array to IntStream
                                    .boxed() // Box each int to Integer
                                    .collect(Collectors.toList()); // Collect as List

                                    //Collections store Objects, so we need to box primitives
        
                                    list.stream()
                                        .filter(n -> n > 2) // Filter elements greater than 2
                                        .forEach(System.out::println);
    }
    
}
