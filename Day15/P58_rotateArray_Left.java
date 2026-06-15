
import java.util.Scanner;


public class P58_rotateArray_Left {


    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = num.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = num.nextInt();
        }

        int U = a[0];
        for (int j = 0; j < n - 1; j++) {
            a[j] = a[j + 1];

        }
        a[n - 1] = U;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }

        num.close();

    }

}