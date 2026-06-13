
import java.util.Scanner;


public class P50_sum_Average {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = num.nextInt();
        int sum = 0;

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" + i + "] : ");
            a[i] = num.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println("Sum of all the elements is : " + sum);
        System.out.print("Average of all the elements is : " + sum / n);
        num.close();
    }
}