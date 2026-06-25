
import java.util.Scanner;

public class P97_mergeSortedArray {
 
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the length of both Array : ");
        int n1 = num.nextInt();
        int n2 = num.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        int[] c = new int[n1 + n2];
        System.out.print("Enter first Array : ");
        for (int i = 0; i < n1; i++) {
            a[i] = num.nextInt();

        }
        System.out.print("Enter second Array : ");
        for (int i = 0; i < n2; i++) {
            b[i] = num.nextInt();

        }
      

        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (i < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }


        for (int q = 0; q < c.length; q++) {
            System.out.print(c[q] + "\t");
        }

        num.close();
    }
}