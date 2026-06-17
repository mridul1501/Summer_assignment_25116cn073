
import java.util.Scanner;


public class P68_common_elements {
  
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = num.nextInt();
        int[] a1 = new int[n1];
        System.out.print("Enter size of second array: ");
        int n2 = num.nextInt();
        int[] a2 = new int[n2];

        
        for (int i = 0; i < n1; i++) {
            System.out.print("a1[" + i + "] = ");
            a1[i] = num.nextInt();
        }
      
        for (int j = 0; j < n2; j++) {
            System.out.print("a2[" + j + "] = ");
            a2[j] = num.nextInt();
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (a1[i] == a2[j]) {
                    System.out.print(a1[i] + "\s\s");
                }
            }
        }
        num.close();

    }

}