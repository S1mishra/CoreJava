import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ComparableAndComparator.Students;

public class ComparatorUsingLambda {
    public static void main(String[] args){
        Students s1 = new Students(15, "Alice");
        Students s2 = new Students(16, "Bob");
        Students s3 = new Students(15, "Steve");
        Students s4 = new Students(15, "Charlie");

        List<Students> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        Collections.sort(studentList, (student1, student2) ->
        {
            if(student1.age-student2.age != 0){
                return student1.age - student2.age;
            }
            else{
                return student1.name.compareTo(student2.name);
            }
        });

        System.out.println("Students sorted by age and name:");
        for(Students s : studentList){
            System.out.println(s);
        }

    }
    
}
