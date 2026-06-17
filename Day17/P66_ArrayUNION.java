
import java.util.Scanner;


public class P66_ArrayUNION {
    
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Enter size of First Array: ");
        int n1 = num.nextInt();
        int[] a1 = new int[n1];
        System.out.print("Enter size of Second Array: ");
        int n2 = num.nextInt();
        int[] a2 = new int[n2];

            for (int i = 0; i < n1; i++) {
            System.out.print("Enter a1[" + i + "] = ");
            a1[i] = num.nextInt();
        }
     for (int j = 0; j < n2; j++) {
            System.out.print("Enter a2[" + j + "] = ");
            a2[j] = num.nextInt();
        }
        for (int i = 0; i < n1; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (a1[i] == a1[j]) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(a1[i] + "\s\s");
            }
        }
        for (int i = 0; i < n2; i++) {
            int count = 0;
            for (int j = 0; j < n1; j++) {
                if (a2[i] == a1[j]) {
                    count++;
                }
            }
            for (int j = 0; j < i; j++) {
                if (a2[i] == a2[j]) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(a2[i] + "\s\s");
            }
        }
        num.close();

    }

}