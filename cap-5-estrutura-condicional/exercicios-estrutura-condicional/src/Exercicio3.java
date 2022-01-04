import java.util.Scanner;

public class Exercicio3 {

    //Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
    //Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
    //ordem crescente ou decrescente
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe dois números inteiros: ");

        int x = sc.nextInt();
        int y = sc.nextInt();

        sc.close();

        if(x % y == 0 || y % x == 0){
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }


    }
}
