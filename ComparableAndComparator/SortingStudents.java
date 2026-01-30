package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingStudents{
    public static void main(String[] args){
        ArrayList<Students> studentList = new ArrayList<>();

        studentList.add(new Students(16, "David"));
        studentList.add(new Students(17, "Alice"));
        studentList.add(new Students(16, "Samantha"));
        studentList.add(new Students(15, "Steve"));
        studentList.add(new Students(18, "David"));

        //Appropriate sorting logic
        //If Comparable was to be used, Students class should implement Comparable interface
        //That is not the case here , so we will use Comparator
        Collections.sort(studentList, new Comparator<Students>() {
            @Override
            public int compare(Students s1, Students s2) {
                //return Integer.compare(s1.age, s2.age);
                return s1.name.compareTo(s2.name);
               
            }
        });

        for(Students student : studentList){
            System.out.println(student.age + " " + student.name);
        }
    }
}