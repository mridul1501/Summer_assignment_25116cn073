
import java.util.Scanner;

public class P105_StudentRecordSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = 500;
        int[] id = new int[n];
        String[] name = new String[n];
        int[] age = new int[n];
        double[] marks = new double[n];

        int count = 0;
        int choice;
        do {
            System.out.println("\n----Student Record Management System----");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student Record");
            System.out.println("5. Delete Student Record");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    
                    System.out.print("\nEnter Student ID: ");
                    id[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Age: ");
                    age[count] = sc.nextInt();

                    System.out.print("Enter Marks: ");
                    marks[count] = sc.nextDouble();

                    count++;

                    System.out.println("Student record added successfully.");
                    break;

                case 2:
                    
                    if (count == 0) {
                        System.out.println("\nNo records found.");
                    } else {
                        System.out.println("\n----Student Records----");
                        for (int i = 0; i < count; i++) {
                            System.out.println("\nStudent " + (i + 1));
                            System.out.println("ID    : " + id[i]);
                            System.out.println("Name  : " + name[i]);
                            System.out.println("Age   : " + age[i]);
                            System.out.println("Marks : " + marks[i]);
                        }
                    }
                    break;

                case 3:
                    
                    System.out.print("\nEnter Student ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == searchId) {
                            found = true;

                            System.out.println("\n----Student Details----");
                            System.out.println("ID    : " + id[i]);
                            System.out.println("Name  : " + name[i]);
                            System.out.println("Age   : " + age[i]);
                            System.out.println("Marks : " + marks[i]);

                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }

                    break;

                case 4:
                    
                    System.out.print("\nEnter Student ID to update: ");
                    int updateId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == updateId) {
                            found = true;

                            sc.nextLine();

                            System.out.print("Enter New Name: ");
                            name[i] = sc.nextLine();

                            System.out.print("Enter New Age: ");
                            age[i] = sc.nextInt();

                            System.out.print("Enter New Marks: ");
                            marks[i] = sc.nextDouble();

                            System.out.println("Record updated successfully.");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }

                    break;

                case 5:
                    
                    System.out.print("\nEnter Student ID to delete: ");
                    int deleteId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == deleteId) {
                            found = true;

                            for (int j = i; j < count - 1; j++) {
                                id[j] = id[j + 1];
                                name[j] = name[j + 1];
                                age[j] = age[j + 1];
                                marks[j] = marks[j + 1];
                            }

                            count--;

                            System.out.println("Record deleted successfully.");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }

                    break;

                case 6:
                    System.out.println("\nThank you for using Student Record Management System!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}