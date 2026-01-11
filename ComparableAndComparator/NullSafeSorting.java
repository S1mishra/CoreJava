package ComparableAndComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class NullSafeSorting {
    public static void main(String[] args){
        String[] names = {"Steve", null, "Nancy", "Mike", null, "Will", "Eleven"};

        System.out.println("Before Sorting:");
        for(String name : names){
            System.out.println(name);
        }

        //Null-safe sorting: Nulls last
        Arrays.sort(names, (s1, s2) -> {
            if(s1 == null && s2 == null) return 0;
            if(s1 == null) return 1; //nulls last
            if(s2 == null) return -1;
            return s1.compareTo(s2);
        });

        System.out.println("\nAfter Null-Safe Sorting (Nulls Last):");
        for(String name : names){
            System.out.println(name);
        }

        //Null-safe sorting: Nulls first
        Arrays.sort(names, (s1, s2) -> {
            if(s1 == null && s2 == null) return 0;
            if(s1 == null) return -1; //nulls first
            if(s2 == null) return 1;
            return s1.compareTo(s2);
        });

        System.out.println("\nAfter Null-Safe Sorting (Nulls first):");
        for(String name : names){
            System.out.println(name);
        }

        //Using built-in Comparator methods for null-safe sorting
        Collections.sort(Arrays.asList(names), Comparator.nullsLast(String::compareTo));
        System.out.println("\nAfter Null-Safe Sorting using Comparator.nullsLast:");
        for(String name : names){
            System.out.println(name);
        }

        Student[] students = {
            new Student(18, "Alice"),
            new Student(17, "Bob"),
            new Student(20, "Charlie")
        };

        //Sort by age the name
        Collections.sort(Arrays.asList(students), Comparator.comparingInt((Student s) -> s.age).thenComparing(s -> s.name));
        System.out.println("\nStudents sorted by age then name:");
        for(Student student : students){
            System.out.println(student);
        }
    }
}
