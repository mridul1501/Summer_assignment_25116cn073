
import java.util.Scanner;


public class P90_firstReapeatingCh {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = Sc.nextLine();
  
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] >= 'A' && a[i] <= 'Z') {
                    if (a[i] == a[j] || a[i] == (a[j] - 32)) {
                        count++;
                    }
                }
                if (a[i] >= 'a' && a[i] <= 'z') {
                    if (a[i] == a[j] || a[i] == (a[j] + 32)) {
                        count++;
                    }
                }

            }
            if (count != 0) {
                System.out.print(a[i]);
                break;
            }

        }

        Sc.close();

    }

}