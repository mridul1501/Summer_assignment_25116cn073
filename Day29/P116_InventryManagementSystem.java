import java.util.Scanner;


class Product {
    int productId;
    String productName;
    int quantity;
    double price;
}
public class P116_InventryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] p = new Product[100];

        int count = 0, choice;

        do {
            System.out.println("\n-----Inventory Management System-----");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Add Stock");
            System.out.println("7. Remove Stock");
            System.out.println("8. Low Stock Alert");
            System.out.println("9. Total Inventory Value");
            System.out.println("10. Search Product By Name");
            System.out.println("11. Sort Products By Quantity");
            System.out.println("12. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    p[count] = new Product();

                    System.out.print("Enter Product ID: ");
                    p[count].productId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    p[count].productName = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    p[count].quantity = sc.nextInt();

                    System.out.print("Enter Price: ");
                    p[count].price = sc.nextDouble();

                    count++;

                    System.out.println("Product Added Successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Products Available");
                    } else {
                        for (int i = 0; i < count; i++) {

                            System.out.println("\nProduct ID : "
                                    + p[i].productId);

                            System.out.println("Product Name : "
                                    + p[i].productName);

                            System.out.println("Quantity : "
                                    + p[i].quantity);

                            System.out.println("Price : "
                                    + p[i].price);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Product ID: ");
                    int searchId = sc.nextInt();

                    int pos = -1;

                    for (int i = 0; i < count; i++) {
                        if (p[i].productId == searchId) {
                            pos = i;
                            break;
                        }
                    }

                    if (pos == -1) {
                        System.out.println("Product Not Found");
                    } else {
                        System.out.println("Product Name : "
                                + p[pos].productName);

                        System.out.println("Quantity : "
                                + p[pos].quantity);

                        System.out.println("Price : "
                                + p[pos].price);
                    }
                    break;

                case 4:
                    System.out.print("Enter Product ID to Update: ");
                    int updateId = sc.nextInt();

                    pos = -1;

                    for (int i = 0; i < count; i++) {
                        if (p[i].productId == updateId) {
                            pos = i;
                            break;
                        }
                    }

                    if (pos != -1) {

                        sc.nextLine();

                        System.out.print("New Product Name: ");
                        p[pos].productName = sc.nextLine();

                        System.out.print("New Quantity: ");
                        p[pos].quantity = sc.nextInt();

                        System.out.print("New Price: ");
                        p[pos].price = sc.nextDouble();

                        System.out.println("Updated Successfully");
                    } else {
                        System.out.println("Product Not Found");
                    }
                    break;

                case 5:
                    System.out.print("Enter Product ID to Delete: ");
                    int deleteId = sc.nextInt();

                    pos = -1;

                    for (int i = 0; i < count; i++) {
                        if (p[i].productId == deleteId) {
                            pos = i;
                            break;
                        }
                    }

                    if (pos != -1) {

                        for (int j = pos; j < count - 1; j++) {
                            p[j] = p[j + 1];
                        }

                        count--;

                        System.out.println("Deleted Successfully");
                    } else {
                        System.out.println("Product Not Found");
                    }
                    break;

                case 6:
                    System.out.print("Enter Product ID: ");
                    int stockId = sc.nextInt();

                    pos = -1;

                    for (int i = 0; i < count; i++) {
                        if (p[i].productId == stockId) {
                            pos = i;
                            break;
                        }
                    }

                    if (pos != -1) {

                        System.out.print(
                                "Enter Quantity to Add: ");

                        int qty = sc.nextInt();

                        p[pos].quantity += qty;

                        System.out.println("Stock Updated");
                    } else {
                        System.out.println("Product Not Found");
                    }
                    break;

                case 7:
                    System.out.print("Enter Product ID: ");
                    int removeId = sc.nextInt();

                    pos = -1;

                    for (int i = 0; i < count; i++) {
                        if (p[i].productId == removeId) {
                            pos = i;
                            break;
                        }
                    }

                    if (pos != -1) {

                        System.out.print(
                                "Enter Quantity to Remove: ");

                        int qty = sc.nextInt();

                        if (qty <= p[pos].quantity) {

                            p[pos].quantity -= qty;

                            System.out.println(
                                    "Stock Removed");
                        } else {
                            System.out.println(
                                    "Insufficient Stock");
                        }
                    } else {
                        System.out.println("Product Not Found");
                    }
                    break;

                case 8:

                    System.out.println(
                            "\nLow Stock Products");

                    for (int i = 0; i < count; i++) {

                        if (p[i].quantity < 5) {

                            System.out.println(
                                    p[i].productId + " "
                                            + p[i].productName
                                            + " Qty="
                                            + p[i].quantity);
                        }
                    }
                    break;

                case 9:

                    double totalValue = 0;

                    for (int i = 0; i < count; i++) {

                        totalValue += p[i].quantity *
                                p[i].price;
                    }

                    System.out.println(
                            "Total Inventory Value = "
                                    + totalValue);

                    break;

                case 10:

                    sc.nextLine();

                    System.out.print(
                            "Enter Product Name: ");

                    String name = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (p[i].productName
                                .equalsIgnoreCase(name)) {

                            System.out.println(
                                    "ID : "
                                            + p[i].productId);

                            System.out.println(
                                    "Quantity : "
                                            + p[i].quantity);

                            System.out.println(
                                    "Price : "
                                            + p[i].price);

                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println(
                                "Product Not Found");
                    }

                    break;

                case 11:

                    for (int i = 0; i < count - 1; i++) {

                        for (int j = i + 1; j < count; j++) {

                            if (p[i].quantity > p[j].quantity) {

                                Product temp = p[i];
                                p[i] = p[j];
                                p[j] = temp;
                            }
                        }
                    }

                    System.out.println(
                            "Sorted Successfully");
                    break;

                case 12:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 12);

        sc.close();
    }

}