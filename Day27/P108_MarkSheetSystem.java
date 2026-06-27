import java.util.Scanner;


public class P108_MarkSheetSystem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 100;

        int[] rollNo = new int[n];
        String[] name = new String[n];
        int[] sub1 = new int[n];
        int[] sub2 = new int[n];
        int[] sub4 = new int[n];
        int[] sub5 = new int[n];
        int[] sub3 = new int[n];
        int[] total = new int[n];
        double[] percentage = new double[n];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Marksheet Generation System =====");
            System.out.println("1. Add Marksheet");
            System.out.println("2. Display All Marksheets");
            System.out.println("3. Search Marksheet by Roll Number");
            System.out.println("4. Update Marksheet");
            System.out.println("5. Delete Marksheet");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("\nEnter Roll Number: ");
                    rollNo[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Marks in Subject 1: ");
                    sub1[count] = sc.nextInt();

                    System.out.print("Enter Marks in Subject 2: ");
                    sub2[count] = sc.nextInt();

                    System.out.print("Enter Marks in Subject 3: ");
                    sub3[count] = sc.nextInt();

                    System.out.print("Enter Marks in Subject 4: ");
                    sub4[count] = sc.nextInt();

                    System.out.print("Enter Marks in Subject 5: ");
                    sub5[count] = sc.nextInt();

                    total[count] = sub1[count] + sub2[count] + sub3[count] + sub4[count] + sub5[count];
                    percentage[count] = total[count] / 5.0;

                    count++;

                    System.out.println("Marksheet added successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("\nNo marksheets found.");
                    } else {
                        System.out.println("\n===== All Marksheets =====");

                        for (int i = 0; i < count; i++) {
                            System.out.println("\nStudent " + (i + 1));
                            System.out.println("Roll Number : " + rollNo[i]);
                            System.out.println("Name        : " + name[i]);
                            System.out.println("Total Marks : " + total[i]);
                            System.out.println("Percentage  : " + percentage[i] + "%");
                        }
                    }
                    break;

                case 3:
                    System.out.print("\nEnter Roll Number to search: ");
                    int searchRoll = sc.nextInt();

                    int position = -1;

                    for (int i = 0; i < count; i++) {
                        if (rollNo[i] == searchRoll) {
                            position = i;
                            break;
                        }
                    }

                    if (position == -1) {
                        System.out.println("Marksheet not found.");
                    } else {
                        System.out.println("\n===== Student Marksheet =====");
                        System.out.println("Roll Number : " + rollNo[position]);
                        System.out.println("Name        : " + name[position]);
                        System.out.println("Subject 1   : " + sub1[position]);
                        System.out.println("Subject 2   : " + sub2[position]);
                        System.out.println("Subject 3   : " + sub3[position]);
                        System.out.println("Subject 4   : " + sub4[position]);
                        System.out.println("Subject 5   : " + sub5[position]);
                        System.out.println("Total Marks : " + total[position]);
                        System.out.println("Percentage  : " + percentage[position] + "%");

                        if (percentage[position] >= 90)
                            System.out.println("Grade       : A");
                        else if (percentage[position] >= 75)
                            System.out.println("Grade       : B");
                        else if (percentage[position] >= 60)
                            System.out.println("Grade       : C");
                        else if (percentage[position] >= 40)
                            System.out.println("Grade       : D");
                        else
                            System.out.println("Grade       : F");
                    }

                    break;

                case 4:
                    System.out.print("\nEnter Roll Number to update: ");
                    int updateRoll = sc.nextInt();

                    position = -1;

                    for (int i = 0; i < count; i++) {
                        if (rollNo[i] == updateRoll) {
                            position = i;
                            break;
                        }
                    }

                    if (position == -1) {
                        System.out.println("Marksheet not found.");
                    } else {
                        sc.nextLine();

                        System.out.print("Enter New Student Name: ");
                        name[position] = sc.nextLine();

                        System.out.print("Enter New Marks in Subject 1: ");
                        sub1[position] = sc.nextInt();

                        System.out.print("Enter New Marks in Subject 2: ");
                        sub2[position] = sc.nextInt();

                        System.out.print("Enter New Marks in Subject 3: ");
                        sub3[position] = sc.nextInt();

                        System.out.print("Enter New Marks in Subject 4: ");
                        sub4[position] = sc.nextInt();

                        System.out.print("Enter New Marks in Subject 5: ");
                        sub5[position] = sc.nextInt();

                        total[position] = sub1[position] + sub2[position] + sub3[position] + sub4[position]
                                + sub5[position];

                        percentage[position] = total[position] / 5.0;

                        System.out.println("Marksheet updated successfully.");
                    }

                    break;

                case 5:
                    System.out.print("\nEnter Roll Number to delete: ");
                    int deleteRoll = sc.nextInt();

                    position = -1;

                    for (int i = 0; i < count; i++) {
                        if (rollNo[i] == deleteRoll) {
                            position = i;
                            break;
                        }
                    }

                    if (position == -1) {
                        System.out.println("Marksheet not found.");
                    } else {
                        for (int j = position; j < count - 1; j++) {
                            rollNo[j] = rollNo[j + 1];
                            name[j] = name[j + 1];
                            sub1[j] = sub1[j + 1];
                            sub2[j] = sub2[j + 1];
                            sub3[j] = sub3[j + 1];
                            sub4[j] = sub4[j + 1];
                            sub5[j] = sub5[j + 1];
                            total[j] = total[j + 1];
                            percentage[j] = percentage[j + 1];
                        }

                        count--;

                        System.out.println("Marksheet deleted successfully.");
                    }

                    break;

                case 6:
                    System.out.println("\nThank you for using Marksheet Generation System!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }

}