package Day19;

import java.util.Scanner;

public class P75_Transpose {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter row and column of matrix: ");
        int r = input.nextInt();
        int c = input.nextInt();
        int[][] a = new int[r][c];
        int[][] T = new int[c][r];
        // taking input of matrix from the user
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter a[" + i + "," + j + "]: ");
                a[i][j] = input.nextInt();
            }
        }
        // logic for transpose
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                T[j][i] = a[i][j];
            }
        }
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(T[i][j] + "\s\s\s");

            }
            System.out.println();
        }

        input.close();

    }
}