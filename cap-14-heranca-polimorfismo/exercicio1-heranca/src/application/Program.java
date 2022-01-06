package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i+1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            String option = sc.next();

            if(option.charAt(0) == 'c'){
                System.out.print("Name: ");
                String name = sc.next();

                System.out.print("Price: ");
                double price = sc.nextDouble();
                sc.nextLine();

                products.add(new Product(name, price));
            } else if(option.charAt(0) == 'u'){
                System.out.print("Name: ");
                String name = sc.next();

                System.out.print("Price: ");
                double price = sc.nextDouble();
                sc.nextLine();

                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufactureDate = sc.next();


                products.add(new UsedProduct(name, price, sdf.parse(manufactureDate)));
            } else if(option.charAt(0) == 'i'){
                System.out.print("Name: ");
                String name = sc.next();

                System.out.print("Price: ");
                double price = sc.nextDouble();
                sc.nextLine();

                System.out.print("Custom fee: ");
                double customFee = sc.nextDouble();
                sc.nextLine();

                products.add(new ImportedProduct(name, price, customFee));
            }


        }

        System.out.println("PRICE TAGS:");

        for(Product product : products){
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
