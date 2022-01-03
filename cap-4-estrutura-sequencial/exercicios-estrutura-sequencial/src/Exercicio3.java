import java.util.Scanner;

public class Exercicio3 {
    //Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
    //de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quatro numero inteiros:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int resultado = a * b - c * d;
        System.out.println("DIFERENÇA = " + resultado);
    }
}
