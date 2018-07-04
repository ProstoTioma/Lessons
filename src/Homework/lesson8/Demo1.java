package Homework.lesson8;

import Homework.lesson8.Course;
import Homework.lesson8.SpecialStudent;
import Homework.lesson8.Student;

public class Demo1 {
    public Student createHighestParent() {
        Student student = new Student("Artem", "Yermolenko", 10, new Course[]{} );
        return student;
    }

    public SpecialStudent createLowestChild() {
        SpecialStudent specialStudent = new SpecialStudent("WAT", "WAR", 10, new Course[]{}, 1111, "Boy");
        return specialStudent;
    }
}
