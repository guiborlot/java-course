import java.util.Scanner;

public class Exercicio1 {
    //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
    //mensagem explicativa, conforme exemplos.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro numero inteiro: ");
        int x = sc.nextInt();
        System.out.println("Informe o segundo numero inteiro: ");
        int y = sc.nextInt();

        int resultado = x + y;

        System.out.println("SOMA = " + resultado);
    }
}
