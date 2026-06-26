
import java.util.Scanner;
public class P104_QuizApplication {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int score = 0;
        int answer;
        System.out.println("Q1. Capital of Uttar Predesh ?");
        System.out.println("1. Bansi");
        System.out.println("2. Lucknow");
        System.out.println("3. Delhi");
        System.out.println("4. Channai");

        answer = num.nextInt();
        if (answer == 2) {
            score++;

        }

        System.out.println("\n\n\nQ2. CM of Uttar Predesh ?");
        System.out.println("1. Mr. Yogi Aadityanath");
        System.out.println("2. Mr. Akhilesh Yadav");
        System.out.println("3. Mr. Modi");
        System.out.println("4. Mr. Ambyj");

        answer = num.nextInt();
        if (answer == 1) {
            score++;

        }

        System.out.println("\n\n\nQ3. Programming Language ?");
        System.out.println("1. bucket");
        System.out.println("2. modulus");
        System.out.println("3. array");
        System.out.println("4. Java");

        answer = num.nextInt();
        if (answer == 4) {
            score++;
        }

        System.out.println("\n\nYour Score : " + score + "/3");

        num.close();
    }

}