package JavaBasics;

public class VarargsInJava {
    public static void main(String[] args){
        for(int i=0; i<3; i++){
            System.out.println("Hello World "+ i);
        }

        m1();
        m1("A");
        m1("a", "b");
    }

    public static void m1(String... args){
        for(int i=0; i<args.length; i++){
            System.out.println(args[i]);
        }
        for(String s: args){ //enhanced for loop
            System.out.println(s);
        }
    }
    
}
