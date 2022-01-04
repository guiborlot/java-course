import java.util.Scanner;

public class Exercicio2 {

    //Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
    //Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
    //essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quantos valores serao lidos: ");
        int contador = sc.nextInt();

        System.out.println("Informe os numeros: ");

        int in = 0;
        int out = 0;

        for(int i=0; i<contador; i++){
            int input = sc.nextInt();
            if(input >= 10 && input <= 20){
                in++;
            } else{
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");


        sc.close();
    }
}
