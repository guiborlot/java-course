package entities;

public class Employee {
    private final Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        setName(name);
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increaseSalary(double amount) {
        salary += ((salary * amount) / 100);
    }

    public void decreaseSalary(Double amount) {
        if(salary > amount){
            salary -= amount;
        } else {
            System.out.println("invalid value");
        }
    }

    public Double getSalary() {
        return salary;
    }
}
