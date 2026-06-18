
import java.util.Scanner;


public class P69_BubbleSort {

    
    static void BubbleSort(int a[], int n) {
        int temp;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

    }

    static void print(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\s\s\s");
        }
    }

    
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the size of an Array : ");
        int n = num.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");

            a[i] = num.nextInt();
        }
        
        System.out.println("UNSORTED ARRAY : ");
        print(a, n);
        System.out.println();
        // FUNCTION CALL FOR SORTING
        BubbleSort(a, n);
        // PRINT SORTED ARRAY
        System.out.println("SORTED ARRAY : ");
        print(a, n);

        num.close();
    }

}