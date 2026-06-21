
import java.util.Scanner;


public class P82_Reverse_String {
   
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = num.nextLine();
      
        char[] a = str.toCharArray();

        System.out.print("Reversed String : ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }

        num.close();
    }
}