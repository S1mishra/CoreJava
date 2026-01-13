package ValueAndReference;

public class CallByValue {
    //Java is strictly call by value
    public static void main(String[] args){
        int x = 5;
        change(x);
        System.out.println("Original x : Value : " +x); 

    }
    static void change(int a){ //copy of x is passed to a
        a = 10; //copy of x is changed
        System.out.println("Copy of x : Value : " +a);
    }
}
