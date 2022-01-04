import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("informe um numero inteiro: ");
        int n = sc.nextInt();

        for(int i=n; i>0; i--){
            if(n % i == 0){
                System.out.println(n/i);
            }
        }
        sc.close();
    }
}
