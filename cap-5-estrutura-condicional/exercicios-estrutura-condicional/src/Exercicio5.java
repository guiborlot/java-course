import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

    //Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
    //seguir, calcule e mostre o valor da conta a pagar.
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o codigo (de 1 ate 5) e a quantidade do produto: ");
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        sc.close();

        float valorDaConta = 0f;

        if(codigo == 1){
            valorDaConta = quantidade * 4f;
        } else if(codigo == 2){
            valorDaConta = quantidade * 4.5f;
        } else if (codigo == 3){
            valorDaConta = quantidade * 5f;
        } else if (codigo == 4) {
            valorDaConta = quantidade * 2f;
        } else if (codigo == 5) {
            valorDaConta = quantidade * 1.5f;
        }

        System.out.printf("Total: R$ %.2f%n", valorDaConta);
    }
}
