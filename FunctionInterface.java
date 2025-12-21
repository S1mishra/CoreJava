import java.util.function.Function;
/*
Methods in Function Interface:
1. apply() = R apply(T t)
2. andThen() = default <V> Function<T, V> 
               andThen(Function<? super R, ? extends V> after) -> this syntax means that the andThen() method takes a Function as an argument where the input type of that Function is compatible with the output type R of the current Function, and the output type of that Function is V.
               where V is the type of output of the after function, and of the composed function

               Parameters: This method accepts a parameter after which is the function to be applied after the current one.
               Return Value: This method returns a composed function that applies the current function first and then the after function  
3. compose() = default <V> Function<V, R> 
               compose(Function<? super V, ? extends T> before) -> this syntax means that the compose() method takes a Function as an argument where the input type of that Function is V, and the output type of that Function is compatible with the input type T of the current Function.
               where V is the type of input to the before function, and of the composed function

               Parameters: This method accepts a parameter before which is the function to be applied before the current one.
               Return Value: This method returns a composed function that applies the before function first and then the current function
4. identity() = This method returns a function that returns its only argument.
                static <T> Function<T, T> identity()
                Parameters: This method does not accept any parameters.
                Return Value: This method returns a function that always returns its input argument.
*/
public class FunctionInterfaceDemo{
    //Main driver method
    public static void main(String args[]){
        //function which takes in a number and returns half of it
        //half is the name of the object of this functional interface
        Function<Integer, Double> half = a -> a/2.0;

        //Try block to check for exceptions -> andThen() throws NullPointerException if the argument is null
        try{
            //tripple the output of half function
            half = half.thenApply(a -> a*3);

            //apply the function to get the result
            System.out.println("Half of 10 and then trippled is: " + half.apply(10));

            //compose also returns nullpointerexception if the argument is null
            //half = half.compose(a -> 3*a);

            //This will throw NullPointerException
            half = half.andThen(null);

            // Function which takes in a number and
            // returns it
            Fucntion<Integer, Integer> identityFunction = Function.identity();
            System.out.println("Identity function output for 5 is: " + identityFunction.apply(5));


        }catch(Exception e){
            System.out.println("Exception caught:"+ e);
        }
    }
}
