import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
    //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o código da peça 1: ");
        int codigo1 = sc.nextInt();

        System.out.println("Informe o número de peças 1: ");
        int number1 = sc.nextInt();

        System.out.println("Informe o valor unitário de cada peça 1: ");
        float valor1 = sc.nextFloat();

        System.out.println("Informe o código da peça 2: ");
        int codigo2 = sc.nextInt();

        System.out.println("Informe o número de peças 2: ");
        int number2 = sc.nextInt();

        System.out.println("Informe o valor unitário de cada peça 2: ");
        float valor2 = sc.nextFloat();

        float total = (number1 * valor1) + (number2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
}
