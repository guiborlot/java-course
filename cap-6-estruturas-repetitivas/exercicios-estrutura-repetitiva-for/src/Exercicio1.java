import java.util.Scanner;

public class Exercicio1 {

    //Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
    //X, se for o caso

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor inteiro: ");

        int valor = sc.nextInt();

        if(valor >= 1 && valor <= 1000) {
            for (int i = 1; i <= valor; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
