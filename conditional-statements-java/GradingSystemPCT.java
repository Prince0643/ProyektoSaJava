
import java.util.Scanner;

public class GradingSystemPCT {

    static String result;
    static String feedback;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        if (score >= 90) {
            result = "A";
            feedback = "Excellent!";
        } else if (score >= 75 && score <= 89) {
            result = "B";
            feedback = "Good Job!";
        } else if (score >= 50 && score <= 74) {
            result = "C";
            feedback = "You can do better!";
        } else {
            result = "F";
            feedback = "Kakaselpon mo yan boss!";
        }

        System.out.println("Grade: " + result);
        System.out.println("Feedback: " + feedback);
    }
}
