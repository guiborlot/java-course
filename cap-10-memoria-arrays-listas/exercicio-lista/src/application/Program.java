package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantity os employees: ");
        int n = sc.nextInt();

        List<Employee> employeeList = new ArrayList<>();

        for(int i=0; i<n; i++){
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);

            employeeList.add(employee);

        }
        System.out.print("ID of the employee who will increase the salary: ");
        int id = sc.nextInt();
        if(hasId(employeeList, id) != null){
            System.out.print("Amount to be increased: ");
            employeeList.get(getIndexOf(employeeList, id)).increaseSalary(sc.nextDouble());
        } else {
            System.out.println("Invalid ID");
        }

        for(Employee employee : employeeList){
            System.out.println("List of employees:");
            System.out.println(employee.getId() + ", " + employee.getName() + ", " + String.format("%.2f", employee.getSalary()));
        }


    }

    public static Integer hasId(List<Employee> list, int id){
        for(Employee e : list){
            if(e.getId() == id){
                return e.getId();
            }
        }
        return null;
    }

    public static Integer getIndexOf(List<Employee> list, int id){
        for(int i = 0; i<list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;


    }
}
