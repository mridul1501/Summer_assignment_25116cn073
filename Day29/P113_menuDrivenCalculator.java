
import java.util.Scanner;

 
class Calculator {
    double num1;
    double num2;
}

public class P113_menuDrivenCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator c = new Calculator();

        int choice;

        do {
            System.out.println("\n===== Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter First Number: ");
                    c.num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    c.num2 = sc.nextDouble();

                    System.out.println("Sum = " + (c.num1 + c.num2));
                    break;

                case 2:
                    System.out.print("Enter First Number: ");
                    c.num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    c.num2 = sc.nextDouble();

                    System.out.println("Difference = " + (c.num1 - c.num2));
                    break;

                case 3:
                    System.out.print("Enter First Number: ");
                    c.num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    c.num2 = sc.nextDouble();

                    System.out.println("Product = " + (c.num1 * c.num2));
                    break;

                case 4:
                    System.out.print("Enter First Number: ");
                    c.num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    c.num2 = sc.nextDouble();

                    if (c.num2 != 0)
                        System.out.println("Quotient = " + (c.num1 / c.num2));
                    else
                        System.out.println("Error : Division by Zero Not Allowed");
                    break;

                case 5:
                    System.out.println("Thank You! Hope you are well . ");
                    break;

                default:
                    System.out.println("Error : Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }

}