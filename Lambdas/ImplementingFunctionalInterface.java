import CustomFunctionalInterface.MathOperation;

public class ImplementingFunctionalInterface {
    public static void main(String[] args){
        //Without lamda, we use anonymous class
        MathOperation addition = new MathOperation(){
            @Override
            public int operate(int a, int b){
                return a+b;
            }
        };
        System.out.println("Addition without lambda: " + addition.operate(5, 3));
    }
    
}
