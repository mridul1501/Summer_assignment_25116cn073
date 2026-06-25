import java.util.Scanner;

public class P99_SORTnames {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter number of members(names) : ");
        int n = Sc.nextInt();
        String[] names = new String[n];

        System.out.println("Enter names : ");
        for (int i = 0; i < n; i++) {
            names[i] = Sc.nextLine();

        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                char[] a = names[j].toCharArray();
                char[] b = names[j + 1].toCharArray();

                int k = 0;
                while (k < a.length && k < b.length && a[k] == b[k]) {
                    k++;
                }
                if (k < a.length && k < b.length && a[k] > b[k]) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;

                }
            }
        }

        System.out.println("Sorted names : ");

        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }

        Sc.close();

    }

}