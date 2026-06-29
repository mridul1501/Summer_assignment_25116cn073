
import java.util.Scanner;


class StringData {
    String str;
}


public class P115_StringOperatingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringData s = new StringData();

        System.out.print("Enter a String: ");
        s.str = sc.nextLine();

        int choice;

        do {
            System.out.println("\n===== String Operations System =====");
            System.out.println("1. Display String");
            System.out.println("2. Find Length");
            System.out.println("3. Convert to Uppercase");
            System.out.println("4. Convert to Lowercase");
            System.out.println("5. Reverse String");
            System.out.println("6. Anagram Test");
            System.out.println("7. First Repeating Character");
            System.out.println("8. First Non-Repeating Character");
            System.out.println("9. Count Vowels and Consonants");
            System.out.println("10. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("String : " + s.str);
                    break;

                case 2:
                    System.out.println("Length = " + s.str.length());
                    break;

                case 3:
                    System.out.println("Uppercase = " + s.str.toUpperCase());
                    break;

                case 4:
                    System.out.println("Lowercase = " + s.str.toLowerCase());
                    break;

                case 5:
                    String rev = "";

                    for (int i = s.str.length() - 1; i >= 0; i--) {
                        rev = rev + s.str.charAt(i);
                    }

                    System.out.println("Reverse = " + rev);
                    break;

                case 6:
                    sc.nextLine();

                    System.out.print("Enter Another String: ");
                    String str2 = sc.nextLine();

                    String s1 = s.str.toLowerCase();
                    str2 = str2.toLowerCase();

                    if (s1.length() != str2.length()) {
                        System.out.println("Not Anagram");
                    } else {

                        char[] a = s1.toCharArray();
                        char[] b = str2.toCharArray();

                        for (int i = 0; i < a.length - 1; i++) {
                            for (int j = i + 1; j < a.length; j++) {

                                if (a[i] > a[j]) {
                                    char temp = a[i];
                                    a[i] = a[j];
                                    a[j] = temp;
                                }

                                if (b[i] > b[j]) {
                                    char temp = b[i];
                                    b[i] = b[j];
                                    b[j] = temp;
                                }
                            }
                        }

                        boolean flag = true;

                        for (int i = 0; i < a.length; i++) {
                            if (a[i] != b[i]) {
                                flag = false;
                                break;
                            }
                        }

                        if (flag)
                            System.out.println("Anagram");
                        else
                            System.out.println("Not Anagram");
                    }
                    break;

                case 7:
                    boolean found = false;

                    for (int i = 0; i < s.str.length(); i++) {
                        for (int j = i + 1; j < s.str.length(); j++) {

                            if (s.str.charAt(i) == s.str.charAt(j)) {
                                System.out.println(
                                        "First Repeating Character = "
                                                + s.str.charAt(i));
                                found = true;
                                break;
                            }
                        }

                        if (found)
                            break;
                    }

                    if (!found)
                        System.out.println("No Repeating Character");

                    break;

                case 8:
                    found = false;

                    for (int i = 0; i < s.str.length(); i++) {

                        int count = 0;

                        for (int j = 0; j < s.str.length(); j++) {
                            if (s.str.charAt(i) == s.str.charAt(j))
                                count++;
                        }

                        if (count == 1) {
                            System.out.println(
                                    "First Non-Repeating Character = "
                                            + s.str.charAt(i));
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("No Non-Repeating Character");

                    break;

                case 9:
                    int vowels = 0, consonants = 0;

                    for (int i = 0; i < s.str.length(); i++) {

                        char ch = Character.toLowerCase(
                                s.str.charAt(i));

                        if (ch >= 'a' && ch <= 'z') {

                            if (ch == 'a' || ch == 'e' ||
                                    ch == 'i' || ch == 'o' ||
                                    ch == 'u')
                                vowels++;
                            else
                                consonants++;
                        }
                    }

                    System.out.println("Vowels = " + vowels);
                    System.out.println("Consonants = " + consonants);
                    break;

                case 10:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 10);

        sc.close();
    }
}