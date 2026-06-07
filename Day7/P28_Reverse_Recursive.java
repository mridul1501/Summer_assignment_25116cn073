

import java.util.Scanner;

public class P28_Reverse_Recursive {
    static int reverse(int a) {
        if (a == 0)
            return;
        rev = rev * 10 + (10 % 10);

        reverse(a / 10);
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        reverse(n);
        num.close();
    }

}