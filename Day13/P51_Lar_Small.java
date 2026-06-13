
import java.util.Scanner;


public class P51_Lar_Small {


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
        int larg = a[0], small = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > larg) {
                larg = a[i];
            } else if (a[i] < small) {
                small = a[i];
            }
        }
        System.out.println("Largest element is : " + larg);
        System.out.print("Smallest element is : " + small);
        num.close();
    }
}