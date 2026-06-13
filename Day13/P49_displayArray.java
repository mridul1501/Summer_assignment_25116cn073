
import java.util.Scanner;

public class P49_displayArray {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = num.nextInt();

        int a[] = new int[n];
        // for input of an array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" + i + "] : ");
            a[i] = num.nextInt();
        }
        // for output of an array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
        num.close();
    }
}