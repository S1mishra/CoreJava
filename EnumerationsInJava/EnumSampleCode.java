package EnumerationsInJava;

public class EnumSampleCode {
    enum Coffee{
        ESPRESSO("Very strong coffee"),
        MOCHA("Bold coffee with chocolate flavor"),
        LATTE("Mild coffee with milk");

        public String strength;

        Coffee(String strength){
            this.strength = strength;
        }

        @Override
        public String toString(){
            //return this.name() + " (" + this.strength + ")";
           //return Coffee.values()[0].name() + " (" + Coffee.values()[0].strength + ")";
            return String.valueOf(strength);
        }
    }

    public static void main(String[] args) {
        Coffee myCoffee = Coffee.ESPRESSO;
        //System.out.println("Selected Coffee: " + myCoffee);
        System.out.println(myCoffee.ESPRESSO);

        Coffee anotherCoffee = Coffee.valueOf("LATTE");
        System.out.println(anotherCoffee);

        Coffee[] allCoffees = Coffee.values();
        for(Coffee coffee : allCoffees){
            System.out.println(coffee);
        }
    }
}
