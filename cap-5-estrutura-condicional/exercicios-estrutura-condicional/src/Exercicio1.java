import java.util.Scanner;

public class Exercicio1 {

    //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");

        int x = sc.nextInt();

        if(x >= 0){
            System.out.println("NÃO NEGATIVO");
        } else{
            System.out.println("NEGATIVO");
        }
    }
}
