package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Holder: ");
        String holder = sc.nextLine();

        System.out.print("Initial balance: ");
        Double balance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.print("Enter amount for withdraw: ");
        try{
            account.withdraw(sc.nextDouble());
            System.out.printf("New balance: %.2f", account.getBalance());
        } catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }



        sc.close();


    }
}
