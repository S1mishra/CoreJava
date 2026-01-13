import CustomFunctionalInterface.MathOperation;

public class ImplementingFunctionalInterfaceUsingLambda {
    public static void main(String[] args){
        //With lambda expression
        MathOperation addition = (a,b) -> a+b;
        System.out.println("Addition with lambda: " + addition.operate(5, 3));
        
    }
    
}
