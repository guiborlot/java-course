package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        String path = "cap-20-funcoes-lambda/exercicio-resolvido-funcoes/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            List<Product> products = new ArrayList<>();

            while(line != null){
                String[] fields = line.split(",");
                products.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();



            }

            double averagePrice = products.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x,y) -> x + y) / products.size();

            Comparator<String> comp = Comparator.comparing(String::toUpperCase);

            List<String> names = products.stream()
                    .filter(p -> p.getPrice() < averagePrice)
                    .map(p -> p.getName()).sorted(comp.reversed())
                    .collect(Collectors.toList());

            System.out.println("Average price: " + String.format("%.2f", averagePrice));
            names.forEach(System.out::println);



        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
