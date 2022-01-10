package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        String path = "cap-17-arquivos/exercicio-arquivos/products.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            line = br.readLine();

            while(line != null){
                String[] aux = line.split(",");
                Product product = new Product(aux[0], Double.parseDouble(aux[1]), Integer.parseInt(aux[2]));
                productList.add(product);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String outPath = "cap-17-arquivos/exercicio-arquivos/out/summary.csv";
        File file = new File("cap-17-arquivos/exercicio-arquivos/out/summary.csv");

        if(!file.exists()){
            file.getParentFile().mkdirs();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outPath))){
            for(Product product : productList){
                String line = product.getName() + "," + product.total().toString();
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }
}
