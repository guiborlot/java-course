package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter your name, then the grades for the three quarters: ");

        student.name = sc.nextLine();
        student.grade1 = sc.nextFloat();
        student.grade2 = sc.nextFloat();
        student.grade3 = sc.nextFloat();

        System.out.println(student);
    }
}
