import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
    //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
    //decimais.
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero do funcionario: ");
        int number = sc.nextInt();

        System.out.println("Informe o numero de horas trabalhadas do funcionario: ");
        int horas = sc.nextInt();

        System.out.println("Informe o valor que recebe por hora trabalhada: ");
        float valorHora = sc.nextFloat();

        float salario = horas * valorHora;

        System.out.println("NUMBER = " + number);
        System.out.println("SALARIO = U$" + salario);

    }
}
