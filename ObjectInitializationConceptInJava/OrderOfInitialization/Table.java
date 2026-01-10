package ObjectInitializationConceptInJava.OrderOfInitialization;

public class Table {
    static Bowl b1 = new Bowl(1);
    Table(){
        System.out.println("Table()\n");
    }    
    static Bowl b2 = new Bowl(2);
}
