package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Course {
    List<Student> students = new ArrayList<>();

    private String name;

    public Course(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }
}
