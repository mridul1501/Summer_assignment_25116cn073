
import java.util.Scanner;


class Contact {
    int contactId;
    String name;
    String phone;
}


public class P112_ContactManagementSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Contact[] contact = new Contact[100];

        int count = 0, choice;

        do {
            System.out.println("\n-----Contact Management System-----");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    contact[count] = new Contact();

                    System.out.print("Enter Contact ID: ");
                    contact[count].contactId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    contact[count].name = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    contact[count].phone = sc.nextLine();

                    count++;
                    System.out.println("Contact Added Successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("Error : No Contacts Found");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("\nContact ID : " + contact[i].contactId);
                            System.out.println("Name : " + contact[i].name);
                            System.out.println("Phone : " + contact[i].phone);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Contact ID: ");
                    int searchId = sc.nextInt();

                    int m = -1;

                    for (int i = 0; i < count; i++) {
                        if (contact[i].contactId == searchId) {
                            m = i;
                            break;
                        }
                    }

                    if (m == -1) {
                        System.out.println("Error : Contact Not Found");
                    } else {
                        System.out.println("Name : " + contact[m].name);
                        System.out.println("Phone : " + contact[m].phone);
                    }
                    break;

                case 4:
                    System.out.print("Enter Contact ID to Update: ");
                    int updateId = sc.nextInt();

                    m = -1;

                    for (int i = 0; i < count; i++) {
                        if (contact[i].contactId == updateId) {
                            m = i;
                            break;
                        }
                    }

                    if (m != -1) {
                        sc.nextLine();

                        System.out.print("New Name: ");
                        contact[m].name = sc.nextLine();

                        System.out.print("New Phone Number: ");
                        contact[m].phone = sc.nextLine();

                        System.out.println("Contact Updated Successfully");
                    } else {
                        System.out.println("Error : Contact Not Found");
                    }
                    break;

                case 5:
                    System.out.print("Enter Contact ID to Delete: ");
                    int deleteId = sc.nextInt();

                    m = -1;

                    for (int i = 0; i < count; i++) {
                        if (contact[i].contactId == deleteId) {
                            m = i;
                            break;
                        }
                    }

                    if (m != -1) {
                        for (int j = m; j < count - 1; j++) {
                            contact[j] = contact[j + 1];
                        }

                        count--;
                        System.out.println("Contact Deleted Successfully");
                    } else {
                        System.out.println("Error : Contact Not Found");
                    }
                    break;

                case 6:
                    System.out.println("Thank You! Hope you are well .");
                    break;

                default:
                    System.out.println("Oops ! Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }

}