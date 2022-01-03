import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
    //casas decimais conforme exemplos.
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        System.out.println("Informe o raio do circulo: ");

        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();

        double area = 3.14159 * Math.pow(raio, 2);

        System.out.printf("A area do circulo é: %.4f%n", area);
    }
}
