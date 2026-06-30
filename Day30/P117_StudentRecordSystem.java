package Day30;

import java.util.Scanner;

class Student {
    String roll;
    String name;
    double[] marks = new double[5]; // 5 SUBJECT
    String behaviorGrade;
    double attendance;
    String feeStatus;
}

public class P117_StudentRecordSystem {

    static final int MAX_STUDENTS = 100;
    static final String[] SUBJECT_NAMES = { "Math", "Science", "English", "History", "Geography" };

    static Student[] students = new Student[MAX_STUDENTS];
    static int studentCount = 0;
    static Scanner scanner = new Scanner(System.in);
    static void registerStudent() {
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("System full! Cannot add more students.");
            return;
        }
        System.out.print("Enter Roll Number: ");
        String roll = scanner.nextLine();
        if (findStudentIndex(roll) != -1) {
            System.out.println("Error: Student with this Roll Number already exists!");
            return;
        }

        // NEW STUDENT
        Student s = new Student();
        s.roll = roll;
        System.out.print("Enter Student Name: ");
        s.name = scanner.nextLine();

        System.out.println("Enter Marks for 5 Subjects (out of 100):");
        for (int i = 0; i < 5; i++) {
            System.out.print(SUBJECT_NAMES[i] + ": ");
            s.marks[i] = scanner.nextDouble();
        }
        scanner.nextLine();

        System.out.print("Enter Behavior & Character Grade (A/B/C/D/F): ");
        s.behaviorGrade = scanner.nextLine().toUpperCase();

        System.out.print("Enter Attendance Percentage: ");
        s.attendance = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Fee Status (Paid/Pending): ");
        s.feeStatus = scanner.nextLine();
        students[studentCount] = s;
        studentCount++;
        System.out.println("Student registered successfully!");
    }

    static void updateStudent() {
        System.out.print("Enter Roll Number to update: ");
        String roll = scanner.nextLine();
        int index = findStudentIndex(roll);

        if (index == -1) {
            System.out.println("Student not found.");
            return;
        }

        Student s = students[index]; // REFERENCE

        System.out.print("Enter New Name (Leave blank to keep unchanged): ");
        String newName = scanner.nextLine();
        if (!newName.trim().isEmpty())
            s.name = newName;

        System.out.print("Do you want to update marks? (y/n): ");
        if (scanner.nextLine().equalsIgnoreCase("y")) {
            for (int i = 0; i < 5; i++) {
                System.out.print(SUBJECT_NAMES[i] + ": ");
                s.marks[i] = scanner.nextDouble();
            }
            scanner.nextLine();
        }

        System.out.print("Enter New Behavior Grade (Leave blank to keep unchanged): ");
        String newGrade = scanner.nextLine();
        if (!newGrade.trim().isEmpty())
            s.behaviorGrade = newGrade.toUpperCase();

        System.out.print("Enter New Attendance (or -1 to keep unchanged): ");
        double newAtt = scanner.nextDouble();
        if (newAtt != -1)
            s.attendance = newAtt;
        scanner.nextLine();

        System.out.print("Enter New Fee Status (Paid/Pending, Leave blank to keep unchanged): ");
        String newFee = scanner.nextLine();
        if (!newFee.trim().isEmpty())
            s.feeStatus = newFee;

        System.out.println("Student details updated successfully!");
    }

    // --- 3. DELETE STUDENT ---
    static void deleteStudent() {
        System.out.print("Enter Roll Number to delete: ");
        String roll = scanner.nextLine();
        int index = findStudentIndex(roll);

        if (index == -1) {
            System.out.println("Student not found.");
            return;
        }

        // SHIFT OBJECT
        for (int i = index; i < studentCount - 1; i++) {
            students[i] = students[i + 1];
        }
        students[studentCount - 1] = null; // FREE
        studentCount--;
        System.out.println("Student record deleted successfully!");
    }

    // --- 4. SEARCH STUDENT ---
    static void searchStudent() {
        System.out.println("Search by: 1. Roll Number | 2. Name");
        int option = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        if (option == 1) {
            System.out.print("Enter Roll Number: ");
            String roll = scanner.nextLine();
            int idx = findStudentIndex(roll);
            if (idx != -1) {
                printSummary(students[idx]);
                found = true;
            }
        } else if (option == 2) {
            System.out.print("Enter Name (or part of name): ");
            String searchName = scanner.nextLine().toLowerCase();
            for (int i = 0; i < studentCount; i++) {
                if (students[i].name.toLowerCase().contains(searchName)) {
                    printSummary(students[i]);
                    found = true;
                }
            }
        }
        if (!found)
            System.out.println("No matching record found.");
    }

    // --- 5. DISPLAY ALL STUDENTS ---
    static void displayAllStudents() {
        if (studentCount == 0) {
            System.out.println("No students registered yet.");
            return;
        }
        System.out
                .println("\n-----------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-8s %-10s %-8s %-10s %-10s\n", "Roll", "Name", "Total", "Perc%", "Grade",
                "Attendance", "Fee Status");
        System.out.println("-----------------------------------------------------------------------------------------");
        for (int i = 0; i < studentCount; i++) {
            Student s = students[i];
            double total = calculateTotal(s);
            double perc = total / 5;
            System.out.printf("%-10s %-20s %-8.1f %-10.2f %-8s %-10.1f%% %-10s\n",
                    s.roll, s.name, total, perc, calculateGrade(perc), s.attendance, s.feeStatus);
        }
    }

    // --- 6. CLASS PERFORMANCE & ANALYTICS ---
    static void displayClassAnalytics() {
        if (studentCount == 0) {
            System.out.println("No student data available.");
            return;
        }

        // Create a temporary array of structures for sorting to avoid mixing original
        // order
        Student[] sortedStudents = new Student[studentCount];
        for (int i = 0; i < studentCount; i++) {
            sortedStudents[i] = students[i];
        }

        // Bubble Sort structured array based on percentage descending
        for (int i = 0; i < studentCount - 1; i++) {
            for (int j = 0; j < studentCount - i - 1; j++) {
                double perc1 = calculateTotal(sortedStudents[j]) / 5;
                double perc2 = calculateTotal(sortedStudents[j + 1]) / 5;
                if (perc1 < perc2) {
                    Student temp = sortedStudents[j];
                    sortedStudents[j] = sortedStudents[j + 1];
                    sortedStudents[j + 1] = temp;
                }
            }
        }

        System.out.println("\n=============== CLASS ANALYTICS ===============");

        // Top 10 Rank Holders / Merit List
        System.out.println("\n--- TOP RANK HOLDERS / MERIT LIST ---");
        int ranks = Math.min(10, studentCount);
        for (int i = 0; i < ranks; i++) {
            double perc = calculateTotal(sortedStudents[i]) / 5;
            System.out.printf("Rank %d: %s (Roll: %s) - %.2f%%\n", (i + 1), sortedStudents[i].name,
                    sortedStudents[i].roll, perc);
        }

        // Subject Toppers
        System.out.println("\n--- SUBJECT TOPPERS ---");
        for (int s = 0; s < 5; s++) {
            Student topper = students[0];
            for (int i = 1; i < studentCount; i++) {
                if (students[i].marks[s] > topper.marks[s]) {
                    topper = students[i];
                }
            }
            System.out.printf("%-10s: %s (Roll: %s) with %.1f marks\n", SUBJECT_NAMES[s], topper.name, topper.roll,
                    topper.marks[s]);
        }

        // Subject-wise Averages
        System.out.println("\n--- SUBJECT-WISE AVERAGE ---");
        for (int s = 0; s < 5; s++) {
            double subjectSum = 0;
            for (int i = 0; i < studentCount; i++) {
                subjectSum += students[i].marks[s];
            }
            System.out.printf("%-10s Class Average: %.2f\n", SUBJECT_NAMES[s], (subjectSum / studentCount));
        }

        // Failed Students & Overall Pass Rate
        System.out.println("\n--- FAILED STUDENTS ---");
        int passCount = 0;
        boolean anyFailed = false;
        for (int i = 0; i < studentCount; i++) {
            double perc = calculateTotal(students[i]) / 5;
            if (perc < 40.0) {
                System.out.printf("Roll: %s | Name: %s | Percentage: %.2f%%\n", students[i].roll, students[i].name,
                        perc);
                anyFailed = true;
            } else {
                passCount++;
            }
        }
        if (!anyFailed)
            System.out.println("None! Everyone passed.");

        double passPercentage = ((double) passCount / studentCount) * 100;
        System.out.printf("\nOverall Class Pass Percentage: %.2f%%\n", passPercentage);
    }

    // --- 7. STUDENT REPORT CARD ---
    static void generateReportCard() {
        System.out.print("Enter Roll Number for Report Card: ");
        String roll = scanner.nextLine();
        int idx = findStudentIndex(roll);

        if (idx == -1) {
            System.out.println("Student record not found.");
            return;
        }

        Student s = students[idx];
        double total = calculateTotal(s);
        double perc = total / 5;

        System.out.println("\n==================================================");
        System.out.println("               OFFICIAL REPORT CARD               ");
        System.out.println("==================================================");
        System.out.printf("Roll Number : %-15s Name : %-20s\n", s.roll, s.name);
        System.out.println("--------------------------------------------------");
        System.out.printf("%-20s %-15s\n", "Subject", "Marks Obtained");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-20s %-15.1f\n", SUBJECT_NAMES[i], s.marks[i]);
        }
        System.out.println("--------------------------------------------------");
        System.out.printf("Total Marks      : %.1f / 500.0\n", total);
        System.out.printf("Percentage       : %.2f%%\n", perc);
        System.out.printf("Academic Grade   : %s\n", calculateGrade(perc));
        System.out.printf("Behavior Grade   : %s\n", s.behaviorGrade);
        System.out.printf("Attendance       : %.1f%%\n", s.attendance);
        System.out.printf("Fee Account Status: %s\n", s.feeStatus);
        System.out.println("==================================================");
    }

    // --- UTILITY METHODS ---
    static int findStudentIndex(String roll) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].roll.equalsIgnoreCase(roll))
                return i;
        }
        return -1;
    }

    static double calculateTotal(Student s) {
        double total = 0;
        for (int i = 0; i < 5; i++) {
            total += s.marks[i];
        }
        return total;
    }

    static String calculateGrade(double percentage) {
        if (percentage >= 90)
            return "A+";
        if (percentage >= 80)
            return "A";
        if (percentage >= 70)
            return "B";
        if (percentage >= 60)
            return "C";
        if (percentage >= 50)
            return "D";
        if (percentage >= 40)
            return "E";
        return "F (Fail)";
    }

    static void printSummary(Student s) {
        double total = calculateTotal(s);
        double perc = total / 5;
        System.out.printf("\n[Found] Roll: %s | Name: %s | Grade: %s | Attendance: %.1f%% | Fees: %s\n",
                s.roll, s.name, calculateGrade(perc), s.attendance, s.feeStatus);
    }

    // MAIN FUNCTION
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM (STRUCTURED) =====");
            System.out.println("1. Register Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student (Roll/Name)");
            System.out.println("5. Display All Students");
            System.out.println("6. Class Performance & Analytics");
            System.out.println("7. Generate Student Report Card");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    registerStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    searchStudent();
                    break;
                case 5:
                    displayAllStudents();
                    break;
                case 6:
                    displayClassAnalytics();
                    break;
                case 7:
                    generateReportCard();
                    break;
                case 8:
                    System.out.println("Exiting System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 8);
    }

}