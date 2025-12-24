package JavaDataTypes;

public class ComparingTwoWrappers {
    public static void main(String[] args){
        Double d1 = 1000.0;
        double d2 = 1000.0;
        int i1 = 1000;
        Integer i2 = Integer.valueOf(1000); //returns a new Integer object each time for values outside the range -128 to 127, in this case returns a new object containing 1000
        Integer i3 = Integer.valueOf(1000);

        System.out.println(d1 == d2);//prints true because d1 is unboxed to a primitive double for comparison
        System.out.println(d1 == i1);//prints true because d1 is unboxed to a primitive double and i1 is promoted to double for comparison
        System.out.println(i1 == i2);//prints true because i2 is unboxed to a primitive int for comparison

        System.out.println(i2 == i3);//prints false because i2 and i3 are different Integer objects and not within the cached range

        i2 = Integer.valueOf(100);//returns cached Integer object for 100 because it is within the range -128 to 127
        i3 = Integer.valueOf(100);//returns the same cached Integer object for 100 because it is within the range -128 to 127
        System.out.println(i2 == i3);//prints true because i2 and i3 refer to the same cached Integer object

        //System.out.println(d1 == i2);//This line would cause a compile-time error because d1 is a Double object and i2 is an Integer object, and Java does not allow direct comparison between different wrapper types.
    }
    
}
