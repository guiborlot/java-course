package entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Teacher extends User {

    private String name;

    private List<Course> courses = new ArrayList<>();

    public Teacher(int id, String name) {
        super(id);
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public int getTotalStudents(){
        Set<Student> set = new HashSet<>();
        for(Course course : courses){
            for(Student student : course.getStudents()){
                set.add(student);
            }
        }
        return set.size();
    }


}