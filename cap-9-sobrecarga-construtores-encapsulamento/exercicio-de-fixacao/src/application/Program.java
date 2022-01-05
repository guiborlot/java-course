package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Account number:");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Name:");
        String name = sc.nextLine();
        Account account = new Account(accountNumber, name);

        System.out.println("Do you want to make a initial deposit? (Y/N)");

        switch(sc.next().toLowerCase()){
            case "y":
                System.out.println("Initial deposti:");
                account = new Account(accountNumber, name, sc.nextDouble());
                System.out.println("Account created");
                break;
            case "n":
                System.out.println("Account created");
                System.out.println(account);
                break;
        }

        System.out.print("Enter a deposit value: ");
        account.increaseMoney(sc.nextDouble());

        System.out.print("Enter a withdraw value: ");
        account.decreaseMoney(sc.nextDouble());


        sc.close();



    }


}
