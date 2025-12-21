// Demonstrates the working of functional interface
import java.util.function.Function;
//A person class with properties
class Person{
    String name;
    int age;

    //Parameterized constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Override the toString() method to display the person details
    @Override
    public String toString(){
        return "Name: " + name + ", Age: " + age;
    }
}

public class FunctionInterfaceExample{
    public static void main(String args[]){
        //a function that takes a Person object and reurns a greeting message with his/her name
        Function<Person, String> greetPerson = person -> "Hello, " + person.name + "!";

        Person p = new Person("Soumya", 25);
        //Applying the function to get the greeting message
        System.out.println(person.apply(p));
    }
}