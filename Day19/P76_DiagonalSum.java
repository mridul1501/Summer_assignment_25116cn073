package Day19;

import java.util.Scanner;

public class P76_DiagonalSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter order of matrix: ");
        int n = input.nextInt();
        int[][] a = new int[n][n];

        // taking input of matrix from the user
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter a[" + i + "," + j + "]: ");
                a[i][j] = input.nextInt();
            }
        }
        // logic for daigonal sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || (i + j) == n - 1) {
                    sum += a[i][j];
                }
            }
        }
        // sum of the diagonal elements
        System.out.print("Sum of all daigonal elements is: " + sum);
        input.close();
    }
}