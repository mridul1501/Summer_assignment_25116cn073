
import java.util.Scanner;

public class P63_PairforSum {
   
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the size of an Array : ");
        int n = num.nextInt();
        int[] a = new int[n];
       
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = num.nextInt();
        }
        
        System.out.print("Enter the target : ");
        int X = num.nextInt();


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] + a[j] == X) {
                    System.out.print(a[i] + "," + a[j] + "\n");
                }

            }
        }
        num.close();
    }

}