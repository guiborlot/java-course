import java.util.Scanner;

public class Exercicio4 {

    //Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
    //segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de pares que serao inseridos: ");

        int quantidade = sc.nextInt();

        for(int i=0; i<quantidade; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(y == 0){
                System.out.println("Divisao impossivel");
            } else {
                double resultado = (double) x / (double) y;
                System.out.printf("%.1f%n", resultado);
            }
        }
        sc.close();
    }
}
