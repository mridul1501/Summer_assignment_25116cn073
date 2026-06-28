
import java.util.Scanner;

class Ticket {
    int ticketId;
    String passengerName;
    String boarding;
    String destination;
    int seats;
}

public class P111_TicketBookingSystem {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ticket[] t = new Ticket[100];

        int count = 0, choice;

        do {
            System.out.println("\n-----Ticket Booking System-----");
            System.out.println("1. Book Ticket");
            System.out.println("2. Display All Tickets");
            System.out.println("3. Search Ticket");
            System.out.println("4. Update Ticket");
            System.out.println("5. Cancel Ticket");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    t[count] = new Ticket();

                    System.out.print("Enter Ticket ID: ");
                    t[count].ticketId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Passenger Name: ");
                    t[count].passengerName = sc.nextLine();

                    System.out.print("Enter Boarding point : ");
                    t[count].boarding = sc.nextLine();

                    System.out.print("Enter Destination: ");
                    t[count].destination = sc.nextLine();

                    System.out.print("Enter Number of Seats: ");
                    t[count].seats = sc.nextInt();

                    count++;
                    System.out.println("Ticket Booked Successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Tickets Found");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("\nTicket ID : " + t[i].ticketId);
                            System.out.println("Passenger Name : " + t[i].passengerName);
                            System.out.println("Boarding point : " + t[i].boarding);
                            System.out.println("Destination : " + t[i].destination);
                            System.out.println("Seats : " + t[i].seats);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Ticket ID: ");
                    int searchId = sc.nextInt();

                    int m = -1;

                    for (int i = 0; i < count; i++) {
                        if (t[i].ticketId == searchId) {
                            m = i;
                            break;
                        }
                    }

                    if (m == -1) {
                        System.out.println("Ticket Not Found");
                    } else {
                        System.out.println("Passenger Name : " + t[m].passengerName);
                        System.out.println("Boarding point : " + t[m].boarding);
                        System.out.println("Destination : " + t[m].destination);
                        System.out.println("Seats : " + t[m].seats);
                    }
                    break;

                case 4:
                    System.out.print("Enter Ticket ID to Update: ");
                    int updateId = sc.nextInt();

                    m = -1;

                    for (int i = 0; i < count; i++) {
                        if (t[i].ticketId == updateId) {
                            m = i;
                            break;
                        }
                    }

                    if (m != -1) {
                        sc.nextLine();

                        System.out.print("New Passenger Name: ");
                        t[m].passengerName = sc.nextLine();

                        System.out.print("New Boarding point : ");
                        t[m].boarding = sc.nextLine();

                        System.out.print("New Destination: ");
                        t[m].destination = sc.nextLine();

                        System.out.print("New Number of Seats: ");
                        t[m].seats = sc.nextInt();

                        System.out.println("Ticket Updated Successfully");
                    } else {
                        System.out.println("Error : Ticket Not Found");
                    }
                    break;

                case 5:
                    System.out.print("Enter Ticket ID to Cancel: ");
                    int cancelId = sc.nextInt();

                    m = -1;

                    for (int i = 0; i < count; i++) {
                        if (t[i].ticketId == cancelId) {
                            m = i;
                            break;
                        }
                    }

                    if (m != -1) {
                        for (int j = m; j < count - 1; j++) {
                            t[j] = t[j + 1];
                        }

                        count--;
                        System.out.println("Ticket Cancelled Successfully");
                    } else {
                        System.out.println("Error : Ticket Not Found");
                    }
                    break;

                case 6:
                    System.out.println("Thank You! Hope you are well . ");
                    break;

                default:
                    System.out.println("Oops! Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }

}