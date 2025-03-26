
import java.util.Scanner;

public class RockPaperScissorsPCT {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your choice (R, P, S): ");
        String[] choices = {"R", "P", "S"};
        String chosen = scanner.nextLine();

        String computerChose = "S";
        System.out.println("Computer chose: " + computerChose);

        switch (chosen) {
            case "R":
                System.out.println("You win!");
                break;
            case "P":
                System.out.println("You lose!");
                break;
            case "S":
                System.out.println("Tie!");
                break;
            default:
                System.out.println("Chose from the choices! Disqualified kana!");
        }
    }
}
