
package Day25;


import java.util.Scanner;


public class P98_commonCHARACTERS {

 
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the first string .");
        String str1 = Sc.nextLine();
        System.out.print("Enter the Second string .");
        String str2 = Sc.nextLine();
       
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        // loop to convert into lower case
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 'A' && a[i] <= 'Z') {
                a[i] = (char) (a[i] + 32);
            }

        }
     
        for (int i = 0; i < b.length; i++) {
            if (b[i] >= 'A' && b[i] <= 'Z') {
                b[i] = (char) (b[i] + 32);
            }

        }
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    break;
                }
            }
            if (j < b.length) {
                System.out.print(a[i] + "\t");
            }
        }

        Sc.close();
    }
}