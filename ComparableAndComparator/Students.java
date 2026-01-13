package ComparableAndComparator;

//This is an utility class to hold multiple student related classes if needed in future
public class Students {
    public int age;
    public String name;

    public Students(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
