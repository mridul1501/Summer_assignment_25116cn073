
import java.util.Scanner;

public class P59_rotateArray_right {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int n = num.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" + i + "] = ");
            a[i] = num.nextInt();
        }
        int U = a[n - 1];
        for (int i = n - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = U;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
        num.close();
    }
}