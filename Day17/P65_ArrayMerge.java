
import java.util.Scanner;

public record P65_ArrayMerge() {
    
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = num.nextInt();
        int[] a1 = new int[n1];
        System.out.print("Enter size of second array: ");
        int n2 = num.nextInt();
        int[] a2 = new int[n2];
        // Merged array
        int[] R = new int[n1 + n2];

    
        for (int i = 0; i < n1; i++) {
            System.out.print("a1[" + i + "] = ");
            a1[i] = num.nextInt();
        }
        // input of second array
        for (int i = 0; i < n2; i++) {
            System.out.print("a2[" + i + "] = ");
            a2[i] = num.nextInt();
        }
        for (int i = 0; i < n1; i++) {
            R[i] = a1[i];
        }
        for (int i = 0; i < n2; i++) {
            R[n1 + i] = a2[i];
        }
        for (int i = 0; i < (n1 + n2); i++) {
            System.out.print(R[i] + "\s\s");
        }

        num.close();
    }

}