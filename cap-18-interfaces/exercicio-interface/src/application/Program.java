package application;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PayPalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.print("Date (dd/MM/yyyy): ");
        String date = sc.next();

        System.out.print("Contract value: ");
        double contractValue = sc.nextDouble();

        System.out.print("Enter number of installments: ");
        int nInstallments = sc.nextInt();

        Contract contract = new Contract(number, sdf.parse(date), contractValue);

        ContractService contractService = new ContractService(new PayPalService());

        contractService.processContract(contract, nInstallments);

        System.out.println("Installments:");
        for(Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }

        sc.close();
    }
}
