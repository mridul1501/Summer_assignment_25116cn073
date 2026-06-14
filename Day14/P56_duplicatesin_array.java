
import java.util.Scanner;


public class P56_duplicatesin_array {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = num.nextInt();

        int[] a = new int[n];
        System.out.print("Enter the elements of array : ");
        int k;
        // LOOP TO ENTER ELEMENTS OF AN ARRAY
        for (k = 0; k < n; k++) {
            System.out.print("a[" + k + "] = ");
            a[k] = num.nextInt();
        }
        System.out.println("DUPLICATE ELEMENTS ARE : ");
        for (int i = 0; i < n; i++) {
            for (int m = i + 1; m < n; m++) {
                if (a[i] == a[m]) {
                    System.out.print(a[i] + "\t");
                    break;
                }
            }
        }

        num.close();
    }
}