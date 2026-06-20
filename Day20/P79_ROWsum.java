
import java.util.Scanner;

public class P79_ROWsum {


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
        System.out.print("Enter row number for sum: ");
        int rown = input.nextInt();
        for (int i = 0; i < rown; i++) {
            for (int j = 0; j < column; j++) {
                sum += arr[rown - 1][j];
            }
        }
        System.out.print("Sum of " + rown + " row is " + sum);
        input.close();
    }

}