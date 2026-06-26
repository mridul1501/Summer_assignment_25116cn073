
import java.util.Scanner;
public class P103_ATM_Stimulation {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        double balance = 50000;
        int choice;
        double amount;

        do {
            System.out.print("\n-------ATM MENU-------\n");
            System.out.println("1. Check Balance ");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice :");

            choice = num.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Current balance = Rs. " + balance);

                    break;

                case 2:
                    System.out.print("Enter the Amount of deposit  ");
                    amount = num.nextDouble();
                    balance += amount;
                    System.out.println("Amount deposited successfully .");

                    break;

                case 3:
                    System.out.print("Enter the amount to withdraw : ");
                    amount = num.nextDouble();
                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Please collect the cash amount : ");
                    } else {
                        System.out.println("Insufficient Balance .");
                    }

                    break;

                case 4:
                    System.out.println("Thankyou for Visiting ATM ");
                    break;

                default:
                    System.out.println("Invalid choice .");
                    break;
            }

        } while (choice != 4);

        num.close();

    }

}