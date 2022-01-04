import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

    //Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
    //de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
    //ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
    //Se o ponto estiver na origem, escreva a mensagem “Origem”.
    //Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
    //situação.
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe duas coordenadas com uma casa decimal, primeiro x depois y: ");
        float x = sc.nextFloat();
        float y = sc.nextFloat();

        sc.close();

        if (x > 0 && y > 0){
            System.out.println("Q1");
        } else if (x < 0 && y > 0){
            System.out.println("Q2");
        } else if (x < 0 && y < 0){
            System.out.println("Q3");
        } else if (x > 0 && y < 0){
            System.out.println("Q4");
        } else if (x == 0 && y == 0){
            System.out.println("Origem");
        }
    }
}
