package application;

import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("linha " + (i + 1) + ": ");
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        printMatriz(matriz);

        System.out.print("Value: ");
        printAsidevalues(matriz, sc.nextInt());
        sc.close();

    }

    public static void printMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printAsidevalues(int[][] matriz, int value) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == value) {
                    System.out.println("Position " + i + "," + j);
                    if (j > 0 ) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    } if (i > 0) {
                        System.out.println("Up: " + matriz[i - 1][j]);
                    } if (j < matriz[i].length - 1) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    } if (i < matriz.length - 1 ) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }
                }
            }
        }
    }
}
