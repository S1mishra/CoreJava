import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionAndConsumer {
    public static void main(String[] args){
        List<String> strList = Arrays.asList("a", "aa", "aaa");
        Function<String, Integer> strLengthFunction = s -> s.length();
        Consumer<Integer> printLength = length -> System.out.println("Length: " + length);
        strList.stream()
                .map(strLengthFunction)
                .forEach(printLength);

        //Or using consumer 
        /*
        Consumer<Integer> printLength = length -> System.out.println("Length: " + length);
        strList.stream()
                .map(strLengthFunction)
                .forEach(length -> System.out.println("Length: " + length));
        */
    }
}

//map() -> It is an intermediate operation that applies a given function to each element of the stream and returns a new stream with the transformed elements.