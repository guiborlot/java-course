import java.util.Scanner;

public class Exercicio4 {

    //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
    //começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("informe dois horarios: ");

        int x = sc.nextInt();
        int y = sc.nextInt();

        sc.close();

        int tempo = 24 - x;
        if (y <= x){
            tempo += (0 + y);
        } else {
            tempo = (y - x);
        }

        System.out.println("O jogo durou " + tempo + " hora(s)");
    }
}
