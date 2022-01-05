package entities;

public class Account {

    private final int accountNumber;
    private String name;
    private double money;

    public Account(int accountNumber, String name, double money){
        this.accountNumber = accountNumber;
        this.name = name;
        increaseMoney(money);
    }

    public Account(int accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void increaseMoney(double money){
        this.money += money;
        System.out.println("Updated " + this);
    }

    public void decreaseMoney(double money){
        if(this.money >= (5 + money)){
            this.money -= (money + 5);
            System.out.println("Updated " + this);
        } else {
            System.out.println("Insuficient balance");
        }

    }

    public String toString(){
        return "Account data:\n"
                + "Account "
                + getAccountNumber()
                + ", Holder: "
                + getName()
                + String.format(", Balance $ %.2f", getMoney());
    }
}
