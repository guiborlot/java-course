import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

    //Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
    //de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
    //conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
    //peso 5.

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de testes que sera realizado: ");
        int quantidade = sc.nextInt();

        for(int i= 0; i<quantidade; i++){
            System.out.println("Informe os tres valores do teste: ");
            float valor1 = sc.nextFloat();
            float valor2 = sc.nextFloat();
            float valor3 = sc.nextFloat();

            float media = (valor1 * 2 + valor2 * 3 + valor3 * 5) / (2 + 3 + 5);
            System.out.printf("%.1f%n", media);
        }
        sc.close();
    }
}
