package JavaBasics;

public class StaticAndInstanceBlock {
    static String s1 = sM1("a");
    {
        s1 = sM1("b"); //instance block, executed when an instance of the class is created, can access both static and instance variables and methods, executed before the constructor
    }
    static{
        s1 = sM1("c"); //static block, executed when the class is loaded, can only access static variables and methods, cannot access instance variables or methods
    }
    public static void main(String[] args){ //a and c are executed when the class is loaded, b is executed when the instance of the class is created, main method is executed after the class is loaded and the instance is created
        System.out.println("Main method"); 
        StaticAndInstanceBlock sib = new StaticAndInstanceBlock(); 
    private static String sM1(String s){
        System.out.println(s);
        return s;
    }
    
}

//order of execution: a, c, main method, b
//why: when the class is loaded, static variables and static blocks are executed in the order they appear in the code, so s1 is initialized with "a", then the static block is executed and s1 is updated to "c". When the main method is executed, it prints "Main method". When an instance of the class is created, the instance block is executed and s1 is updated to "b".