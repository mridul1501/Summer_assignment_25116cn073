
import java.util.Scanner;

public class P102_VotingEligibility {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int criteria = 18;

        System.out.println("\n\n------VOTING ELIGIBILITY SYSTEM-------");
        System.out.print("Enter the voter name :");
        String name = num.nextLine();
        System.out.print("Enter Your age : ");
        int age = num.nextInt();
        System.out.println("\n\n----VOTING STATUS----");

        if (age >= 18) {
            System.out.println("Voter name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Status : Elegible.");
            System.out.println("You meet the minimum requirement of " + criteria + " years.");
        } else {
            int lefty = criteria - age;
            System.out.println("Voter name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Status : Not Elegible.");
            System.out.println("You need " + lefty + " year(s) to meet the minimum eligibility requirement of "
                    + criteria + " years.");

        }
        System.out.println("\n\nThankyou for using this system.");

        num.close();

    }
}