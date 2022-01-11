package application;

import entities.Course;
import entities.Student;
import entities.Teacher;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students for course A? ");
        Course courseA = new Course("A");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            Student student = new Student(sc.nextInt());
            courseA.addStudent(student);
        }

        System.out.print("How many students for course B? ");
        Course courseB = new Course("B");
        number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            Student student = new Student(sc.nextInt());
            courseB.addStudent(student);
        }

        System.out.print("How many students for course C? ");
        Course courseC = new Course("C");
        number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            Student student = new Student(sc.nextInt());
            courseC.addStudent(student);
        }

        Teacher teacher = new Teacher(1, "Alex");
        teacher.addCourse(courseA);
        teacher.addCourse(courseB);
        teacher.addCourse(courseC);

        System.out.println(teacher.getTotalStudents());
    }
}
