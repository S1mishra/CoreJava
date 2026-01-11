package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudentsUsingComparator {
    public static void main(String[] args){

        List<Students> studentsList = new ArrayList<>();

        studentsList.add(new Students(12, "Steve"));
        studentsList.add(new Students(18, "Nancy"));
        studentsList.add(new Students(15, "Mike"));
        studentsList.add(new Students(17, "Steve"));
        studentsList.add(new Students(13, "Will"));
        studentsList.add(new Students(18, "Eleven"));

        System.out.println("Before Sorting:");
        studentsList.forEach(System.out::println);

        //Sorting using Comparator - Custom Sorting Logic outside the class
        Collections.sort(studentsList, (s1, s2) -> {
            //Primary Sorting - Age
            int ageComparison = s1.age - s2.age;
            if(ageComparison != 0){
                return ageComparison;
            }
            //Secondary Sorting - Name
            return s1.name.compareTo(s2.name);
        });

        System.out.println("\nAfter Sorting:");
        studentsList.forEach(System.out::println);

        /*
        //Comparator can internally use compareTo() of fields that themselves implement Comparable.
        //Sort using age
        Collections.sort(studentsList, (s1,s2) -> Integer.compare(s1.age, s2.age));

        //Name in descending order
        Collections.sort(studentsList, (s1, s2) -> s2.name.compareTo(s1.name));
        //above compareTo is method from String class which implements Comparable interface
        */
    }
}
