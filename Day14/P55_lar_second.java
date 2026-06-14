
import java.util.Scanner;


public class P55_lar_second {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = num.nextInt();

        int[] a = new int[n];
        System.out.print("Enter the elements of array : ");
        int i, lar1, lar2;
        // LOOP TO ENTER ELEMENTS OF AN ARRAY
        for (i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = num.nextInt();
        }
        lar1 = a[0];
        lar2 = a[0];
        for (i = 0; i < n; i++) {
            if (a[i] > lar1) {
                lar2 = lar1;
                lar1 = a[i];
            } else if (a[i] > lar2 && a[i] != lar1)
                lar2 = a[i];
        }

        System.out.print(" Second largest = " + lar2);

        num.close();
    }
}