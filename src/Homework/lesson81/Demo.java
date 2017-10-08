package Homework.lesson81;

public class Demo {
    public Student createHighestParent() {
        Student student = new Student("Artem", "Yermolenko", 10, null);
        return student;
    }

    public SpecialStudent createLowestChild() {
        SpecialStudent specialStudent = new SpecialStudent("WAT", "WAR", 10, null, 1111, "Boy");
        return specialStudent;
    }
}
