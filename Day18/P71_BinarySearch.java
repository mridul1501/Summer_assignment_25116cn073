
import java.util.Scanner;


public class P71_BinarySearch {
    
    static int binarysearch(int a[], int n, int key) {
        int beg = 0, mid, end = n - 1;
        while (beg <= end) {
            mid = (beg + end) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] > key)
                end = mid - 1;
            else
                beg = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter size of an Array : ");
        int n = num.nextInt();
        int[] a = new int[n];
        int i, result;

        for (i = 0; i < n; i++) {
            System.out.print("Enter a[" + i + "] = ");
            a[i] = num.nextInt();

        }

        System.out.print("Enter the search element : ");
        int key = num.nextInt();

        result = binarysearch(a, n, key);
        if (result != -1)
            System.out.print("Element found at index  value " + result);
        else
            System.out.print("Element not found");

        num.close();

    }

}