package ObjectInitializationConceptInJava.OrderOfInitialization;

public class OrderOfInitializationMainClass {
    public static void main(String[] args){
        new Dishwasher();
    }
    static Table t = new Table();
    static Dishwasher dw = new Dishwasher();
}

/* 
1. When the program starts, the static members of the main class are initialized first. This means that the static Table t is created first.
2. During the creation of the Table object, the static members of the Table class are initialized in the order they are defined. So, Bowl b1 is created first, followed by Bowl b2.
3. After the static members are initialized, the Table constructor is called, printing "Table()".
4. Next, the static Dishwasher dw is created.
5. During the creation of the Dishwasher object, the static members of the Dishwasher class are initialized in the order they are defined. So, Bowl b4 is created first, followed by Bowl b5.
6. After the static members are initialized, the instance members of the Dishwasher class are initialized. So, Bowl b3 is created.
7. Finally, the Dishwasher constructor is called, printing "Dishwasher()".

Output:

Bowl(1)
Bowl(2)
Table()

Bowl(4)
Bowl(5)
Bowl(3)
Dishwasher()

Bowl(3)
Dishwasher()
*/

