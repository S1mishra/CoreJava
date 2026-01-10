package ObjectInitializationConceptInJava.OrderOfInitialization;

public class Dishwasher {
    Bowl b3 = new Bowl(3);
    static Bowl b4 = new Bowl(4);
    Dishwasher(){
        System.out.println("Dishwasher()\n");
    }
    static Bowl b5 = new Bowl(5);
}
