
import java.util.Scanner;


public class P61_missingNUMinArray {


    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int[] a = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
        int n = a.length + 1;
        int aSum = 0;
        int missing;
        int sum = n * (n + 1) / 2;

        for (int i = 0; i < a.length; i++) {
            aSum += a[i];
        }
        missing = sum - aSum;
        System.out.print("Missing number : " + missing);

        num.close();
    }

}