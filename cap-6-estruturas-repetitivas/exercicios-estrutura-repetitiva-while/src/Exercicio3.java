import java.util.Scanner;

public class Exercicio3 {

    //Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
    //um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
    //4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
    //que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
    //mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
    //exemplo.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. alcool");
        System.out.println("2. gasolina");
        System.out.println("3. diesel");
        System.out.println("4. fim");

        int opcao = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while(opcao != 4){
            switch(opcao){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
            opcao = sc.nextInt();
        }

        System.out.println("Muito Obrigado!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);


        sc.close();
    }
}
