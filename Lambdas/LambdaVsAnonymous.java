import java.util.Comparator;

public class LambdaVsAnonymous {
    public static void main(String[] args){
        Comparator<Integer> comparatorAnonymous = new Comparator<>(){
            @Override
            public int compare(Integer a, Integer b){
                return a.compareTo(b);
            }
        };

        System.out.println("Comparison using anonymous class: " + comparatorAnonymous.compare(5, 3));

        Comparator<Integer> comparatorLambda = (a,b) -> a.compareTo(b);
        System.out.println("Comparison using lambda expression: " + comparatorLambda.compare(5, 3));
    }
    
}
