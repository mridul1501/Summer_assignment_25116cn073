
import java.util.Scanner;


public class P57_Array_Reverse {


    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the size of an Array : ");
        int n = num.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = num.nextInt();
        }
    
        int b = 0;
        int c = n - 1;
        while (b < c) {
            int U = a[b];
            a[b] = a[c];
            a[c] = U;
            b++;
            c--;
        }
        System.out.print("Reverse of an Array : \n");
        // loop to print reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }

        num.close();
    }

}