package ValueAndReference;

import ComparableAndComparator.Students;

//This looks like call by reference, but it’s NOT ->
// A copy of the reference is passed ,
// Both references point to the same object ,
// Object’s data changes, not the reference

public class PassAnObject {
    public static void main(String[] args){
        Students student = new Students(15, "Shreya");
        modifyObject(student);
        System.out.println("Original Student Name: " + student.name);
        change(student);
        System.out.println("Original Student Name after change method: " + student.name);
    }

    static void modifyObject(Students s){
        s.name = "Soumya"; //copy of reference is passed to s -> both references point to the same object
        s.age = 10;
        System.out.println("Modified Student Name: " + s.name);
    }

    static void change(Students stu){
        stu = new Students(16, "Shrishti"); //copy of reference is passed to stu -> and this copy is now referring to a new object
        System.out.println("Inside change method Student Name: " + stu.name);
    }
}
