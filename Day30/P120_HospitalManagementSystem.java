
import java.util.Scanner;

class Patient {
    int patientId;
    String patientName;
    int age;
    String gender;
    String disease;
    String doctor;
    int roomNo;
    double bill;
    boolean admitted;
}

public class P120_HospitalManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Patient[] p = new Patient[100];

        int count = 0, choice;

        do {

            System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Patient");
            System.out.println("2. Display Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Update Patient");
            System.out.println("5. Delete Patient");
            System.out.println("6. Admit Patient");
            System.out.println("7. Discharge Patient");
            System.out.println("8. Assign Doctor");
            System.out.println("9. Search By Disease");
            System.out.println("10. Generate Bill");
            System.out.println("11. Display Admitted Patients");
            System.out.println("12. Total Patients");
            System.out.println("13. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    p[count] = new Patient();

                    System.out.print("Enter Patient ID : ");
                    p[count].patientId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Patient Name : ");
                    p[count].patientName = sc.nextLine();

                    System.out.print("Enter Age : ");
                    p[count].age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Gender : ");
                    p[count].gender = sc.nextLine();

                    System.out.print("Enter Disease : ");
                    p[count].disease = sc.nextLine();

                    System.out.print("Enter Doctor Name : ");
                    p[count].doctor = sc.nextLine();

                    System.out.print("Enter Room Number : ");
                    p[count].roomNo = sc.nextInt();

                    System.out.print("Enter Initial Bill : ");
                    p[count].bill = sc.nextDouble();

                    p[count].admitted = false;

                    count++;

                    System.out.println("Patient Added Successfully");

                    break;

                case 2:

                    if (count == 0) {

                        System.out.println("No Patient Record Found");
                    }

                    else {

                        for (int i = 0; i < count; i++) {

                            System.out.println("\nPatient ID : "
                                    + p[i].patientId);

                            System.out.println("Name : "
                                    + p[i].patientName);

                            System.out.println("Age : "
                                    + p[i].age);

                            System.out.println("Gender : "
                                    + p[i].gender);

                            System.out.println("Disease : "
                                    + p[i].disease);

                            System.out.println("Doctor : "
                                    + p[i].doctor);

                            System.out.println("Room No : "
                                    + p[i].roomNo);

                            System.out.println("Bill : "
                                    + p[i].bill);

                            if (p[i].admitted)
                                System.out.println("Status : Admitted");
                            else
                                System.out.println("Status : Discharged");
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Patient ID : ");
                    int searchId = sc.nextInt();

                    int pos = -1;

                    for (int i = 0; i < count; i++) {

                        if (p[i].patientId == searchId) {

                            pos = i;
                            break;
                        }
                    }

                    if (pos == -1) {

                        System.out.println("Patient Not Found");
                    }

                    else {

                        System.out.println("Name : "
                                + p[pos].patientName);

                        System.out.println("Disease : "
                                + p[pos].disease);

                        System.out.println("Doctor : "
                                + p[pos].doctor);

                        System.out.println("Room No : "
                                + p[pos].roomNo);

                        System.out.println("Bill : "
                                + p[pos].bill);
                    }

                    break;

                case 4:

                    System.out.print("Enter Patient ID : ");
                    int updateId = sc.nextInt();

                    pos = -1;

                    for (int i = 0; i < count; i++) {

                        if (p[i].patientId == updateId) {

                            pos = i;
                            break;
                        }
                    }

                    if (pos != -1) {

                        sc.nextLine();

                        System.out.print("New Patient Name : ");
                        p[pos].patientName = sc.nextLine();

                        System.out.print("New Age : ");
                        p[pos].age = sc.nextInt();
                        sc.nextLine();

                        System.out.print("New Gender : ");
                        p[pos].gender = sc.nextLine();

                        System.out.print("New Disease : ");
                        p[pos].disease = sc.nextLine();

                        System.out.print("New Doctor : ");
                        p[pos].doctor = sc.nextLine();

                        System.out.print("New Room Number : ");
                        p[pos].roomNo = sc.nextInt();

                        System.out.print("New Bill : ");
                        p[pos].bill = sc.nextDouble();

                        System.out.println("Patient Updated Successfully");
                    }

                    else {

                        System.out.println("Patient Not Found");
                    }

                    break;

                case 5:

                    System.out.print("Enter Patient ID : ");
                    int deleteId = sc.nextInt();

                    pos = -1;

                    for (int i = 0; i < count; i++) {

                        if (p[i].patientId == deleteId) {

                            pos = i;
                            break;
                        }
                    }

                    if (pos != -1) {

                        for (int j = pos; j < count - 1; j++) {

                            p[j] = p[j + 1];
                        }

                        count--;

                        System.out.println("Patient Deleted Successfully");
                    }

                    else {

                        System.out.println("Patient Not Found");
                    }

                    break;

                case 6:

                    System.out.print("Enter Patient ID : ");
                    int admitId = sc.nextInt();

                    pos = -1;

                    for (int i = 0; i < count; i++) {

                        if (p[i].patientId == admitId) {

                            pos = i;
                            break;
                        }
                    }

                    if (pos != -1) {

                        p[pos].admitted = true;

                        System.out.println("Patient Admitted Successfully");
                    }

                    else {

                        System.out.println("Patient Not Found");
                    }

                    break;

                case 7:

                    System.out.print("Enter Patient ID : ");
                    int dischargeId = sc.nextInt();

                    pos = -1;

                    for (int i = 0; i < count; i++) {

                        if (p[i].patientId == dischargeId) {

                            pos = i;
                            break;
                        }
                    }

                    if (pos != -1) {

                        p[pos].admitted = false;

                        System.out.println("Patient Discharged Successfully");
                    }

                    else {

                        System.out.println("Patient Not Found");
                    }

                    break;

                case 8:

                    System.out.print("Enter Patient ID : ");
                    int doctorId = sc.nextInt();

                    pos = -1;

                    for (int i = 0; i < count; i++) {

                        if (p[i].patientId == doctorId) {

                            pos = i;
                            break;
                        }
                    }

                    if (pos != -1) {

                        sc.nextLine();

                        System.out.print("Enter New Doctor Name : ");
                        p[pos].doctor = sc.nextLine();

                        System.out.println("Doctor Assigned Successfully");
                    }

                    else {

                        System.out.println("Patient Not Found");
                    }

                    break;

                case 9:

                    sc.nextLine();

                    System.out.print("Enter Disease : ");
                    String disease = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (p[i].disease.equalsIgnoreCase(disease)) {

                            System.out.println("\nPatient ID : " + p[i].patientId);
                            System.out.println("Name : " + p[i].patientName);
                            System.out.println("Doctor : " + p[i].doctor);
                            System.out.println("Room No : " + p[i].roomNo);

                            found = true;
                        }
                    }

                    if (!found) {

                        System.out.println("No Patient Found");
                    }

                    break;

                case 10:

                    System.out.print("Enter Patient ID : ");
                    int billId = sc.nextInt();

                    pos = -1;

                    for (int i = 0; i < count; i++) {

                        if (p[i].patientId == billId) {

                            pos = i;
                            break;
                        }
                    }

                    if (pos != -1) {

                        System.out.print("Enter Room Charges : ");
                        double room = sc.nextDouble();

                        System.out.print("Enter Medicine Charges : ");
                        double medicine = sc.nextDouble();

                        System.out.print("Enter Test Charges : ");
                        double test = sc.nextDouble();

                        double totalBill = p[pos].bill + room + medicine + test;

                        System.out.println("Total Bill = " + totalBill);
                    }

                    else {

                        System.out.println("Patient Not Found");
                    }

                    break;

                case 11:

                    System.out.println("\nAdmitted Patients");

                    boolean admitFound = false;

                    for (int i = 0; i < count; i++) {

                        if (p[i].admitted) {

                            System.out.println(
                                    p[i].patientId + "   "
                                            + p[i].patientName
                                            + "   Room "
                                            + p[i].roomNo);

                            admitFound = true;
                        }
                    }

                    if (!admitFound) {

                        System.out.println("No Admitted Patients");
                    }

                    break;

                case 12:

                    System.out.println("Total Patients = " + count);

                    break;

                case 13:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 13);

        sc.close();
    }
}