
import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    String department;
    String designation;
    double salary;
}
public class P119_Employ {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] e = new Employee[100];

        int count = 0, choice;

        do {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Search By Name");
            System.out.println("7. Increase Salary");
            System.out.println("8. Calculate Bonus");
            System.out.println("9. Highest Salary");
            System.out.println("10. Total Salary Expense");
            System.out.println("11. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    e[count] = new Employee();

                    System.out.print("Enter Employee ID : ");
                    e[count].empId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name : ");
                    e[count].empName = sc.nextLine();

                    System.out.print("Enter Department : ");
                    e[count].department = sc.nextLine();

                    System.out.print("Enter Designation : ");
                    e[count].designation = sc.nextLine();

                    System.out.print("Enter Salary : ");
                    e[count].salary = sc.nextDouble();

                    count++;

                    System.out.println("Employee Added Successfully");

                    break;

                case 2:

                    if (count == 0) {

                        System.out.println("No Employee Found");
                    }

                    else {

                        for (int i = 0; i < count; i++) {

                            System.out.println("\nEmployee ID : "
                                    + e[i].empId);

                            System.out.println("Name : "
                                    + e[i].empName);

                            System.out.println("Department : "
                                    + e[i].department);

                            System.out.println("Designation : "
                                    + e[i].designation);

                            System.out.println("Salary : "
                                    + e[i].salary);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Employee ID : ");

                    int searchId = sc.nextInt();

                    int pos = -1;

                    for (int i = 0; i < count; i++) {

                        if (e[i].empId == searchId) {

                            pos = i;
                            break;
                        }
                    }

                    if (pos == -1) {

                        System.out.println("Employee Not Found");
                    }

                    else {

                        System.out.println("Name : "
                                + e[pos].empName);

                        System.out.println("Department : "
                                + e[pos].department);

                        System.out.println("Designation : "
                                + e[pos].designation);

                        System.out.println("Salary : "
                                + e[pos].salary);
                    }

                    break;

                case 4:

                    System.out.print("Enter Employee ID : ");

                    int updateId = sc.nextInt();

                    pos = -1;

                    for (int i = 0; i < count; i++) {

                        if (e[i].empId == updateId) {

                            pos = i;
                            break;
                        }
                    }

                    if (pos != -1) {

                        sc.nextLine();

                        System.out.print("New Name : ");
                        e[pos].empName = sc.nextLine();

                        System.out.print("New Department : ");
                        e[pos].department = sc.nextLine();

                        System.out.print("New Designation : ");
                        e[pos].designation = sc.nextLine();

                        System.out.print("New Salary : ");
                        e[pos].salary = sc.nextDouble();

                        System.out.println("Employee Updated Successfully");
                    }

                    else {

                        System.out.println("Employee Not Found");
                    }

                    break;

                case 5:

                    System.out.print("Enter Employee ID : ");
                    int deleteId = sc.nextInt();

                    pos = -1;

                    for (int i = 0; i < count; i++) {

                        if (e[i].empId == deleteId) {

                            pos = i;
                            break;
                        }
                    }

                    if (pos != -1) {

                        for (int j = pos; j < count - 1; j++) {

                            e[j] = e[j + 1];
                        }

                        count--;

                        System.out.println("Employee Deleted Successfully");
                    }

                    else {

                        System.out.println("Employee Not Found");
                    }

                    break;

                case 6:

                    sc.nextLine();

                    System.out.print("Enter Employee Name : ");
                    String name = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (e[i].empName.equalsIgnoreCase(name)) {

                            System.out.println("\nEmployee ID : " + e[i].empId);
                            System.out.println("Department : " + e[i].department);
                            System.out.println("Designation : " + e[i].designation);
                            System.out.println("Salary : " + e[i].salary);

                            found = true;
                        }
                    }

                    if (!found) {

                        System.out.println("Employee Not Found");
                    }

                    break;

                case 7:

                    System.out.print("Enter Employee ID : ");
                    int incId = sc.nextInt();

                    pos = -1;

                    for (int i = 0; i < count; i++) {

                        if (e[i].empId == incId) {

                            pos = i;
                            break;
                        }
                    }

                    if (pos != -1) {

                        System.out.print("Enter Increment Amount : ");
                        double inc = sc.nextDouble();

                        e[pos].salary += inc;

                        System.out.println("Salary Updated Successfully");
                    }

                    else {

                        System.out.println("Employee Not Found");
                    }

                    break;

                case 8:

                    System.out.print("Enter Employee ID : ");
                    int bonusId = sc.nextInt();

                    pos = -1;

                    for (int i = 0; i < count; i++) {

                        if (e[i].empId == bonusId) {

                            pos = i;
                            break;
                        }
                    }

                    if (pos != -1) {

                        double bonus = e[pos].salary * 0.10;

                        System.out.println("Bonus = " + bonus);
                        System.out.println("Total Salary = "
                                + (e[pos].salary + bonus));
                    }

                    else {

                        System.out.println("Employee Not Found");
                    }

                    break;

                case 9:

                    if (count > 0) {

                        double max = e[0].salary;
                        int index = 0;

                        for (int i = 1; i < count; i++) {

                            if (e[i].salary > max) {

                                max = e[i].salary;
                                index = i;
                            }
                        }

                        System.out.println("Highest Salary Employee");

                        System.out.println("ID : " + e[index].empId);
                        System.out.println("Name : " + e[index].empName);
                        System.out.println("Salary : " + e[index].salary);
                    }

                    else {

                        System.out.println("No Employee Found");
                    }

                    break;

                case 10:

                    double total = 0;

                    for (int i = 0; i < count; i++) {

                        total += e[i].salary;
                    }

                    System.out.println("Total Salary Expense = " + total);

                    break;

                case 11:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 11);

        sc.close();
    }
}