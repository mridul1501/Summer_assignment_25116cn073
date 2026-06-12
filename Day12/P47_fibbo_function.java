import java.util.Scanner;


public class P47_fibbo_function {

    static void Fibbo(int a) {
        int i, n1 = 0, n2 = 1, n3;
        for (i = 0; i < a; i++) {
            System.out.print(n1 + "\t");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }


    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number of terms in series : ");
        int n = num.nextInt();
        Fibbo(n);
        num.close();
    }

}