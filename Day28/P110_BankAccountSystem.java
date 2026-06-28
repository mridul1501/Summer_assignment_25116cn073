
import java.util.Scanner;


class Account {
    int ACno;
    String name;
    double balance;
}
public class P110_BankAccountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = 500;
        Account[] AC = new Account[L];

        int count = 0, choice;

        do {
            System.out.println("\n-----Bank Account System-----");
            System.out.println("1. Create Account");
            System.out.println("2. Display All Accounts");
            System.out.println("3. Search Account");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Delete Account");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    AC[count] = new Account();

                    System.out.print("Enter Account Number: ");
                    AC[count].ACno = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    AC[count].name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    AC[count].balance = sc.nextDouble();

                    count++;
                    System.out.println("Account Created Successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Accounts Found");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("\nAccount No : " + AC[i].ACno);
                            System.out.println("Name : " + AC[i].name);
                            System.out.println("Balance : " + AC[i].balance);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int searchAC = sc.nextInt();

                    int M = -1;

                    for (int i = 0; i < count; i++) {
                        if (AC[i].ACno == searchAC) {
                            M = i;
                            break;
                        }
                    }

                    if (M == -1) {
                        System.out.println("Account Not Found");
                    } else {
                        System.out.println("Name : " + AC[M].name);
                        System.out.println("Balance : " + AC[M].balance);
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int depAcc = sc.nextInt();

                    M = -1;

                    for (int i = 0; i < count; i++) {
                        if (AC[i].ACno == depAcc) {
                            M = i;
                            break;
                        }
                    }

                    if (M != -1) {
                        System.out.print("Enter Deposit Amount: ");
                        double deposit = sc.nextDouble();

                        AC[M].balance += deposit;

                        System.out.println("Deposit Successful");
                        System.out.println("New Balance : " + AC[M].balance);
                    } else {
                        System.out.println("Account Not Found");
                    }
                    break;

                case 5:
                    System.out.print("Enter Account Number: ");
                    int withAcc = sc.nextInt();

                    M = -1;

                    for (int i = 0; i < count; i++) {
                        if (AC[i].ACno == withAcc) {
                            M = i;
                            break;
                        }
                    }

                    if (M != -1) {
                        System.out.print("Enter Withdraw Amount: ");
                        double withdraw = sc.nextDouble();

                        if (withdraw <= AC[M].balance) {
                            AC[M].balance -= withdraw;

                            System.out.println("Withdrawal Successful");
                            System.out.println("Remaining Balance : " + AC[M].balance);
                        } else {
                            System.out.println("Insufficient Balance");
                        }
                    } else {
                        System.out.println("Account Not Found");
                    }
                    break;

                case 6:
                    System.out.print("Enter Account Number to Delete: ");
                    int delAcc = sc.nextInt();

                    M = -1;

                    for (int i = 0; i < count; i++) {
                        if (AC[i].ACno == delAcc) {
                            M = i;
                            break;
                        }
                    }

                    if (M != -1) {
                        for (int j = M; j < count - 1; j++) {
                            AC[j] = AC[j + 1];
                        }

                        count--;
                        System.out.println("Account Deleted Successfully");
                    } else {
                        System.out.println("Account Not Found");
                    }
                    break;

                case 7:
                    System.out.println("Thank You! Hope you are well .");
                    break;

                default:
                    System.out.println("Oops! Invalid Choice");
            }

        } while (choice != 7);

        sc.close();
    }

}