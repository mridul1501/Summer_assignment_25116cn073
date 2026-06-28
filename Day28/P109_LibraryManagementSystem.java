//PACKAGE FOR DAY 28 ASSIGNMENT
package Day28;

//IMPORT SCANNER FOR USER INPUT
import java.util.Scanner;

//STRUCTURE DEFINE 
class Book {
    int id;
    String name;
    String author;
    int quantity;
}

// DEFINE CLASS
public class P109_LibraryManagementSystem {
    // MAIN FUNCTION
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = 500;
        Book[] book = new Book[l];
        int count = 0, choice;

        do {
            System.out.println("\n-----Library Management System-----");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    book[count] = new Book();

                    System.out.print("Enter Book ID: ");
                    book[count].id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    book[count].name = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    book[count].author = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    book[count].quantity = sc.nextInt();

                    count++;
                    System.out.println("Book Added Successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Books Available");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("\nBook ID : " + book[i].id);
                            System.out.println("Book Name : " + book[i].name);
                            System.out.println("Author : " + book[i].author);
                            System.out.println("Quantity : " + book[i].quantity);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    int searchId = sc.nextInt();

                    int a = -1;

                    for (int i = 0; i < count; i++) {
                        if (book[i].id == searchId) {
                            a = i;
                            break;
                        }
                    }

                    if (a == -1) {
                        System.out.println("Book Not Found");
                    } else {
                        System.out.println("Book Name : " + book[a].name);
                        System.out.println("Author : " + book[a].author);
                        System.out.println("Quantity : " + book[a].quantity);
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to Update: ");
                    int updateId = sc.nextInt();

                    a = -1;

                    for (int i = 0; i < count; i++) {
                        if (book[i].id == updateId) {
                            a = i;
                            break;
                        }
                    }

                    if (a != -1) {
                        sc.nextLine();

                        System.out.print("New Book Name: ");
                        book[a].name = sc.nextLine();

                        System.out.print("New Author: ");
                        book[a].author = sc.nextLine();

                        System.out.print("New Quantity: ");
                        book[a].quantity = sc.nextInt();

                        System.out.println("Updated Successfully");
                    } else {
                        System.out.println("Error : Book Not Found");
                    }
                    break;

                case 5:
                    System.out.print("Enter Book ID to Delete: ");
                    int deleteId = sc.nextInt();

                    a = -1;

                    for (int i = 0; i < count; i++) {
                        if (book[i].id == deleteId) {
                            a = i;
                            break;
                        }
                    }

                    if (a != -1) {
                        for (int j = a; j < count - 1; j++) {
                            book[j] = book[j + 1];
                        }

                        count--;
                        System.out.println("Deleted Successfully");
                    } else {
                        System.out.println("Error : Book Not Found");
                    }
                    break;

                case 6:
                    System.out.println("Thank You ! Hope you are well . ");
                    break;

                default:
                    System.out.println("Oops! Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }
}