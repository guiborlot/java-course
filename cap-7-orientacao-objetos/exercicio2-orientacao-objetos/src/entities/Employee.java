package entities;

public class Employee {

    public String name;
    public Double grossSalary;
    public Double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        grossSalary += (grossSalary * percentage / 100) - tax;
        System.out.println("Updated data: Joao Silva, $ " + grossSalary);
    }

    public String toString(){
        return "Employee: "
                + name
                + ", $ "
                + netSalary();
    }
}
