
import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    String author;
    int quantity;
    double price;
    boolean issued;
}

public class P118_Mini_Library {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book[] b = new Book[100];

        int count = 0, choice;

        do {

            System.out.println("\n===== MINI LIBRARY SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Issue Book");
            System.out.println("7. Return Book");
            System.out.println("8. Search By Author");
            System.out.println("9. Available Books");
            System.out.println("10. Fine Calculator");
            System.out.println("11. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    b[count] = new Book();

                    System.out.print("Enter Book ID : ");
                    b[count].bookId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name : ");
                    b[count].bookName = sc.nextLine();

                    System.out.print("Enter Author Name : ");
                    b[count].author = sc.nextLine();

                    System.out.print("Enter Quantity : ");
                    b[count].quantity = sc.nextInt();

                    System.out.print("Enter Price : ");
                    b[count].price = sc.nextDouble();

                    b[count].issued = false;

                    count++;

                    System.out.println("Book Added Successfully.");

                    break;

                case 2:

                    if (count == 0) {

                        System.out.println("No Books Found");
                    }

                    else {

                        for (int i = 0; i < count; i++) {

                            System.out.println("\nBook ID : "
                                    + b[i].bookId);

                            System.out.println("Book Name : "
                                    + b[i].bookName);

                            System.out.println("Author : "
                                    + b[i].author);

                            System.out.println("Quantity : "
                                    + b[i].quantity);

                            System.out.println("Price : "
                                    + b[i].price);

                            if (b[i].issued)

                                System.out.println("Status : Issued");

                            else

                                System.out.println("Status : Available");
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Book ID : ");

                    int searchId = sc.nextInt();

                    int pos = -1;

                    for (int i = 0; i < count; i++) {

                        if (b[i].bookId == searchId) {

                            pos = i;

                            break;
                        }
                    }

                    if (pos == -1)

                        System.out.println("Book Not Found");

                    else {

                        System.out.println("Book Name : "
                                + b[pos].bookName);

                        System.out.println("Author : "
                                + b[pos].author);

                        System.out.println("Quantity : "
                                + b[pos].quantity);

                        System.out.println("Price : "
                                + b[pos].price);
                    }

                    break;

                case 4:

                    System.out.print("Enter Book ID : ");

                    int updateId = sc.nextInt();

                    pos = -1;

                    for (int i = 0; i < count; i++) {

                        if (b[i].bookId == updateId) {

                            pos = i;

                            break;
                        }
                    }

                    if (pos != -1) {

                        sc.nextLine();

                        System.out.print("New Book Name : ");
                        b[pos].bookName = sc.nextLine();

                        System.out.print("New Author : ");
                        b[pos].author = sc.nextLine();

                        System.out.print("New Quantity : ");
                        b[pos].quantity = sc.nextInt();

                        System.out.print("New Price : ");
                        b[pos].price = sc.nextDouble();

                        System.out.println("Updated Successfully");
                    }

                    else {

                        System.out.println("Book Not Found");
                    }

                    break;

                case 5:

                    System.out.print("Enter Book ID to Delete : ");
                    int deleteId = sc.nextInt();

                    pos = -1;

                    for (int i = 0; i < count; i++) {

                        if (b[i].bookId == deleteId) {

                            pos = i;
                            break;
                        }
                    }

                    if (pos != -1) {

                        for (int j = pos; j < count - 1; j++) {

                            b[j] = b[j + 1];
                        }

                        count--;

                        System.out.println("Book Deleted Successfully");
                    }

                    else {

                        System.out.println("Book Not Found");
                    }

                    break;

                case 6:

                    System.out.print("Enter Book ID : ");
                    int issueId = sc.nextInt();

                    pos = -1;

                    for (int i = 0; i < count; i++) {

                        if (b[i].bookId == issueId) {

                            pos = i;
                            break;
                        }
                    }

                    if (pos != -1) {

                        if (b[pos].quantity > 0) {

                            b[pos].quantity--;
                            b[pos].issued = true;

                            System.out.println("Book Issued Successfully");
                        }

                        else {

                            System.out.println("Book Out of Stock");
                        }
                    }

                    else {

                        System.out.println("Book Not Found");
                    }

                    break;

                case 7:

                    System.out.print("Enter Book ID : ");
                    int returnId = sc.nextInt();

                    pos = -1;

                    for (int i = 0; i < count; i++) {

                        if (b[i].bookId == returnId) {

                            pos = i;
                            break;
                        }
                    }

                    if (pos != -1) {

                        b[pos].quantity++;
                        b[pos].issued = false;

                        System.out.println("Book Returned Successfully");
                    }

                    else {

                        System.out.println("Book Not Found");
                    }

                    break;

                case 8:

                    sc.nextLine();

                    System.out.print("Enter Author Name : ");
                    String author = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (b[i].author.equalsIgnoreCase(author)) {

                            System.out.println("\nBook ID : " + b[i].bookId);
                            System.out.println("Book Name : " + b[i].bookName);
                            System.out.println("Quantity : " + b[i].quantity);

                            found = true;
                        }
                    }

                    if (!found) {

                        System.out.println("No Book Found");
                    }

                    break;

                case 9:

                    System.out.println("\nAvailable Books");

                    for (int i = 0; i < count; i++) {

                        if (b[i].quantity > 0) {

                            System.out.println(
                                    b[i].bookId + "  "
                                            + b[i].bookName
                                            + "  Qty = "
                                            + b[i].quantity);
                        }
                    }

                    break;

                case 10:

                    System.out.print("Enter Late Days : ");
                    int days = sc.nextInt();

                    double fine = 0;

                    if (days > 0) {

                        fine = days * 5;
                    }

                    System.out.println("Fine = Rs. " + fine);

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