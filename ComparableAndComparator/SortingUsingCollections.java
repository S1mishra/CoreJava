package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollections {
    //This code uses Collections.sort() method to sort
    public static void main(String[] args) {
        List<Students> studentList = new ArrayList<>();

        studentList.add(new Students(14, "John"));
        studentList.add(new Students(18, "Nancy"));
        studentList.add(new Students(15, "Mike"));
        studentList.add(new Students(17, "Steve"));
        studentList.add(new Students(13, "Will"));
        studentList.add(new Students(18, "Eleven"));

        System.out.println("Before Sorting:");
        studentList.forEach(System.out::println);

        //Sorting using Collections.sort() method
        //sort by age
        //Collections.sort(studentList, (s1, s2) -> Integer.compare(s1.age, s2.age));
        Collections.sort(studentList, (s1, s2) -> s1.age - s2.age);

        System.out.println("\nAfter Sorting by Age:");
        studentList.forEach(System.out::println);

        //Sorting by name-> using compareTo() of String class
        Collections.sort(studentList, (s1, s2) -> s1.name.compareTo(s2.name));
        System.out.println("\nAfter Sorting by Name:");
        studentList.forEach(System.out::println);
    }
}
