
import java.util.Scanner;
import java.lang.Math;

public class P22_Binary_Deci {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number in Binary  form : ");
        int n = input.nextInt();
        int deci = 0;

        int i = 0;
        while (n > 0) {
            int r = n % 10;
            deci = (((int) Math.pow(2, i) * r) + deci);// logic for conversion
            n = n / 10;// vale of n updated
            i++;// update i
        }
        System.out.print("Decimal value is : " + deci);
        input.close();
    }
}