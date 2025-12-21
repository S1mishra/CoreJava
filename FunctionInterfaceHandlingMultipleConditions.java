public class FunctionInterfaceHandlingMultipleConditions {
    public static void main(String args[]){
        Function<Integer, Integer> addFive = a -> a + 5;
        Function<Integer, Integer> multiplyByTwo = a -> a * 2;

        //Applying function sequentially -> add five and then multiply by two
        Function<Integer, Integer>  result = addFive.andThen(multiplyByTwo);

        System.out.println("Result after adding five and then multiplying by two: " + result.apply(10)); // (10 + 5) * 2 = 30
    }
}