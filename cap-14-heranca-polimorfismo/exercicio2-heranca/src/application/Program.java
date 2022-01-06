package application;

import entities.Individual;
import entities.TaxPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<TaxPlayer> taxPlayers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i+1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char option = sc.next().charAt(0);
            sc.nextLine();

            if(option == 'i'){
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();

                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                taxPlayers.add(new Individual(name, anualIncome, healthExpenditures));
            } else if(option == 'c'){
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();

                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                sc.nextLine();

                taxPlayers.add(new Individual(name, anualIncome, numberOfEmployees));
            }

        }

        System.out.println("TAXES PAID: ");

        double totalTaxes = 0;

        for (TaxPlayer taxPlayer: taxPlayers){
            totalTaxes += taxPlayer.tax();
            System.out.printf("%s: $ %.2f%n", taxPlayer.getName(), taxPlayer.tax());
        }

        System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);
        sc.close();
    }
}
