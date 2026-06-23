
import java.util.Scanner;


public class P92_maxOCCURch {


    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = Sc.nextLine();
      
        char[] a = str.toCharArray();
        int maxCount = 0;
        char maxOCCUR = '\0';
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
            if (count > maxCount) {
                maxCount = count;
                maxOCCUR = a[i];
            }

        }

        System.out.print("Character " + maxOCCUR + " is maximum occuring character with frequency " + (maxCount + 1));

        Sc.close();

    }

}