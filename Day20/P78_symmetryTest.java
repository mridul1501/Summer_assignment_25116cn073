
import java.util.Scanner;


public class P78_symmetryTest {

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
       
        if (row != column) {
            System.out.print("Not a symmetric matrix");
            input.close();
            return;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] != arr[j][i]) {
                    System.out.print("Not a symmetric matrix");
                    input.close();
                    return;
                }
            }

        }
        System.out.print("Symmetric matrix");

        input.close();
    }

}