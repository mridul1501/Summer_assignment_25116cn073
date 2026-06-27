
import java.util.Scanner;

public class P106_EmployeeRecordSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 100;

        int[] id = new int[n];
        String[] name = new String[n];
        int[] age = new int[n];
        String[] department = new String[n];
        double[] salary = new double[n];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Update Employee Record");
            System.out.println("5. Delete Employee Record");
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

                    System.out.print("Enter Age: ");
                    age[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Department: ");
                    department[count] = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    salary[count] = sc.nextDouble();

                    count++;

                    System.out.println("Employee record added successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("\nNo records found.");
                    } else {
                        System.out.println("\n===== Employee Records =====");

                        for (int i = 0; i < count; i++) {
                            System.out.println("\nEmployee " + (i + 1));
                            System.out.println("ID         : " + id[i]);
                            System.out.println("Name       : " + name[i]);
                            System.out.println("Age        : " + age[i]);
                            System.out.println("Department : " + department[i]);
                            System.out.println("Salary     : ₹" + salary[i]);
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
                        System.out.println("Employee not found.");
                    } else {
                        System.out.println("\n===== Employee Details =====");
                        System.out.println("ID         : " + id[position]);
                        System.out.println("Name       : " + name[position]);
                        System.out.println("Age        : " + age[position]);
                        System.out.println("Department : " + department[position]);
                        System.out.println("Salary     : ₹" + salary[position]);
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
                        System.out.println("Employee not found.");
                    } else {
                        sc.nextLine();

                        System.out.print("Enter New Name: ");
                        name[position] = sc.nextLine();

                        System.out.print("Enter New Age: ");
                        age[position] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Department: ");
                        department[position] = sc.nextLine();

                        System.out.print("Enter New Salary: ");
                        salary[position] = sc.nextDouble();

                        System.out.println("Record updated successfully.");
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
                        System.out.println("Employee not found.");
                    } else {
                        for (int j = position; j < count - 1; j++) {
                            id[j] = id[j + 1];
                            name[j] = name[j + 1];
                            age[j] = age[j + 1];
                            department[j] = department[j + 1];
                            salary[j] = salary[j + 1];
                        }

                        count--;

                        System.out.println("Employee record deleted successfully.");
                    }

                    break;

                case 6:
                    System.out.println("\nThank you for using Employee Management System!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }

}