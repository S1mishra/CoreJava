package JavaBasics;

public class LocalStaticAndInstanceVariables {
    final static double percent = 0; //static variable, also called class variable, shared by all instances of the class // compile time constant, cannot be changed after initialization, can be accessed without creating an instance of the class
    int offset = 10, base = 50; //instance variables, also called object variables

    public static double calc(double value){
        int coupon, offset, base; //local variables, only accessible within this method, not shared by instances of the class //shadowing instance variables with local variables of the same name
        if(percent < 10){
            coupon = 15;
            offset = 20;
            base = 10;
        }

        return coupon*offset*base*value/100;
    }
    
}
