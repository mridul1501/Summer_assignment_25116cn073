
import java.util.Scanner;


public class P73_MatrixADD {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter row of first matrix: ");
        int r1 = input.nextInt();
        System.out.print("Enter column of first matrix: ");
        int c1 = input.nextInt();
        System.out.print("Enter row of first matrix: ");
        int r2 = input.nextInt();
        System.out.print("Enter column of first matrix: ");
        int c2 = input.nextInt();
        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] sum = new int[r1][c1];

        if (r1 == r2 && c1 == c2) {
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print("Enter a[" + i + "," + j + "]: ");
                    a[i][j] = input.nextInt();
                }
            }
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print("Enter b[" + i + "," + j + "]: ");
                    b[i][j] = input.nextInt();
                }
            }
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    sum[i][j] = a[i][j] + b[i][j];
                }
            }
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(sum[i][j] + "\s\s\s");

                }
                System.out.println();
            }
        } else {
            System.out.print("Additon is not possible");
        }

        input.close();
    }

}