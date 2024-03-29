package entities;

public class Company extends TaxPlayer{

    private int numberOfEmployees;

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;

    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {

        double tax;

        if(getNumberOfEmployees() > 10){
            tax = getAnualIncome() * 0.14;
        } else {
            tax = getAnualIncome() * 0.16;
        }

        return tax;
    }
}
