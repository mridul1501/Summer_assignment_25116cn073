
import java.util.Scanner;

public class P83_count_Vowel_Consonant {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = num.nextLine();
        // TO STORE STRING AS ARRAY OF CHARACTERS
        char[] a = str.toCharArray();

        int V = 0, C = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] >= 'a' && a[i] <= 'z') || (a[i] >= 'A' && a[i] <= 'Z')) {
                if ((a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u')
                        || (a[i] == 'A' || a[i] == 'E' || a[i] == 'I' || a[i] == 'O' || a[i] == 'U'))
                    V++;
                else
                    C++;
            }
        }

        System.out.print("Vowels : " + V + "\nConsonants : " + C);

        num.close();
    }
}