package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Name, gross salary and tax: ");
        Employee employee = new Employee();
        employee.name = sc.nextLine();
        employee.grossSalary = sc.nextDouble();
        employee.tax = sc.nextDouble();

        System.out.println(employee);

        System.out.println("Which percentage to increase salary");
        employee.increaseSalary(sc.nextDouble());

        sc.close();
    }

}
