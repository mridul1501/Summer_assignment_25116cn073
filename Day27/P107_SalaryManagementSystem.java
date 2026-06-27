
import java.util.Scanner;


public class P107_SalaryManagementSystem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 100; 

        int[] id = new int[n];
        String[] name = new String[n];
        double[] basicSalary = new double[n];
        double[] bonus = new double[n];
        double[] totalSalary = new double[n];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Salary Management System =====");
            System.out.println("1. Add Salary Record");
            System.out.println("2. Display All Salary Records");
            System.out.println("3. Search Salary Record by Employee ID");
            System.out.println("4. Update Salary Record");
            System.out.println("5. Delete Salary Record");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("\nEnter Employee ID: ");
                    id[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    basicSalary[count] = sc.nextDouble();

                    System.out.print("Enter Bonus Amount: ");
                    bonus[count] = sc.nextDouble();

                    totalSalary[count] = basicSalary[count] + bonus[count];

                    count++;

                    System.out.println("Salary record added successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("\nNo salary records found.");
                    } else {
                        System.out.println("\n===== Salary Records =====");

                        for (int i = 0; i < count; i++) {
                            System.out.println("\nEmployee " + (i + 1));
                            System.out.println("ID            : " + id[i]);
                            System.out.println("Name          : " + name[i]);
                            System.out.println("Basic Salary  : ₹" + basicSalary[i]);
                            System.out.println("Bonus         : ₹" + bonus[i]);
                            System.out.println("Total Salary  : ₹" + totalSalary[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("\nEnter Employee ID to search: ");
                    int searchId = sc.nextInt();

                    int position = -1;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == searchId) {
                            position = i;
                            break;
                        }
                    }

                    if (position == -1) {
                        System.out.println("Salary record not found.");
                    } else {
                        System.out.println("\n===== Salary Details =====");
                        System.out.println("ID            : " + id[position]);
                        System.out.println("Name          : " + name[position]);
                        System.out.println("Basic Salary  : ₹" + basicSalary[position]);
                        System.out.println("Bonus         : ₹" + bonus[position]);
                        System.out.println("Total Salary  : ₹" + totalSalary[position]);
                    }

                    break;

                case 4:
                    System.out.print("\nEnter Employee ID to update: ");
                    int updateId = sc.nextInt();

                    position = -1;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == updateId) {
                            position = i;
                            break;
                        }
                    }

                    if (position == -1) {
                        System.out.println("Salary record not found.");
                    } else {
                        sc.nextLine();

                        System.out.print("Enter New Employee Name: ");
                        name[position] = sc.nextLine();

                        System.out.print("Enter New Basic Salary: ");
                        basicSalary[position] = sc.nextDouble();

                        System.out.print("Enter New Bonus Amount: ");
                        bonus[position] = sc.nextDouble();

                        totalSalary[position] = basicSalary[position] + bonus[position];

                        System.out.println("Salary record updated successfully.");
                    }

                    break;

                case 5:
                    System.out.print("\nEnter Employee ID to delete: ");
                    int deleteId = sc.nextInt();

                    position = -1;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == deleteId) {
                            position = i;
                            break;
                        }
                    }

                    if (position == -1) {
                        System.out.println("Salary record not found.");
                    } else {
                        for (int j = position; j < count - 1; j++) {
                            id[j] = id[j + 1];
                            name[j] = name[j + 1];
                            basicSalary[j] = basicSalary[j + 1];
                            bonus[j] = bonus[j + 1];
                            totalSalary[j] = totalSalary[j + 1];
                        }

                        count--;

                        System.out.println("Salary record deleted successfully.");
                    }

                    break;

                case 6:
                    System.out.println("\nThank you for using Salary Management System!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }

}