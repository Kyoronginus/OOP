package binus;

import java.util.List;

public class Course {
    Faculty faculty;
    List<Student> students;

    public Course(List<Student> students){
        if (students.size() < 5|| students.size() > 60){
            System.out.println("Students size is incorrect");
        }
    }
}
