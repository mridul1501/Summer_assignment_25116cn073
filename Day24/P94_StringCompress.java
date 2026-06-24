T
import java.util.Scanner;

public class P94_StringCompress {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = Sc.nextLine();
        char[] a = str.toCharArray();
        int count;
        for (int i = 0; i < a.length; i++) {
            count = 1;
            while (i < a.length - 1 && a[i] == a[i + 1]) {
                count++;
                i++;
            }
            System.out.print(a[i]);
            if (count > 1) {
                System.out.print(count);
            }
        }
        Sc.close();
    }

}