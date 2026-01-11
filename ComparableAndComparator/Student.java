package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    //I know how to compare myself
    //Comparison logic lives inside the class
    //Only one natural ordering

    int age;
    String name;

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student o){
        return this.age - o.age;
    }

    @Override
    public String toString(){
        return "Student{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args){
        Student s1 = new Student(18, "Alice");
        Student s2 = new Student(17, "Bob");
        Student s3 = new Student(20, "Charlie");
        Student s4 = new Student(20, "Steve");

        System.out.println(s1.compareTo(s2)); // >0
        System.out.println(s1.compareTo(s3)); // <0
        System.out.println(s3.compareTo(s4)); // 0

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        Collections.sort(studentList);
        System.out.println(studentList);
    }
}