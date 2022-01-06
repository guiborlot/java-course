package entities;

public class Individual extends TaxPlayer{

    private Double healtExpenditures;

    public Individual(String name, Double anualIncome, double healtExpenditures) {
        super(name, anualIncome);
        this.healtExpenditures = healtExpenditures;
    }

    public Double getHealtExpenditures() {
        return healtExpenditures;
    }

    public void setHealtExpenditures(Double healtExpenditures) {
        this.healtExpenditures = healtExpenditures;
    }

    @Override
    public Double tax() {
        double tax = 0;
        if(getAnualIncome() < 20000){
            tax = getAnualIncome() * 15 / 100;
        } else if(getAnualIncome() >= 20000){
            tax = getAnualIncome() * 25 / 100;
        }

        if(healtExpenditures > 0){
            tax -= healtExpenditures / 2;
        }
        return tax;
    }


}
