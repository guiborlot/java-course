package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String path = "cap-20-funcoes-lambda/exercicio-proposto-funcoes/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            List<Employee> employees = new ArrayList<>();

            while (line != null) {
                String[] fields = line.split(",");

                employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));

                line = br.readLine();

            }

            System.out.print("Enter salary: ");
            double salaryFilter = sc.nextDouble();

            List<String> sortedEmail = employees.stream()
                    .filter(e -> e.getSalary() > salaryFilter)
                    .map(e -> e.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            double sumSalary = employees.stream()
                    .filter(e -> e.getName().toUpperCase().charAt(0) == 'M')
                    .map(e -> e.getSalary())
                    .reduce(0.0, (x, y) -> x + y);


            System.out.println("Email of people whose salary is more than " + salaryFilter + ":");
            sortedEmail.forEach(System.out::println);

            System.out.println(sumSalary);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
