
import java.util.Scanner;

public class P80_columnSUM {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter row of matrix: ");
        int row = input.nextInt();
        System.out.print("Enter column of matrix: ");
        int column = input.nextInt();
        int[][] arr = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter arr[" + i + "," + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }
        int sum = 0;
        System.out.print("Enter column number for sum: ");
        int n = input.nextInt();
        for (int i = 0; i < row; i++) {
            sum += arr[i][n - 1];
        }
        System.out.print("Sum of " + n + " column is " + sum);
        input.close();
    }

}