
import java.util.Scanner;


public class P52_Even_Odd_count {
    public static void main(String[] args) {

        Scanner NUM = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = NUM.nextInt();

        int a[] = new int[n];
        // for input of an array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" + i + "] : ");
            a[i] = NUM.nextInt();
        }
        int even = 0, odd = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Number of even elements is : " + even);
        System.out.print("Number of odd elements is : " + odd);
        NUM.close();
    }
}