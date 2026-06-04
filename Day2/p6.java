import java.util.*;

public class P6_numREV {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = num.nextInt();
        int rev = 0, n1;
        n1 = n;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }
        n = n1;
        System.out.print("Reverse of number " + n + " is " + rev);
        num.close();
    }

}