
import java.util.*;

public class GuessingGamePCT {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomInt = random.nextInt(50);
        System.out.println(randomInt);

        int guessInput = 0;
        int attempts = 0;

        while (guessInput != randomInt){
            System.out.print("Guess a number between 1 and 50: ");
            guessInput = scanner.nextInt();
            attempts++;

            if (guessInput < randomInt){
                System.out.println("Too low! Try Again.");
            } else if (guessInput > randomInt) {
                System.out.println("Too high! Try Again.");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }
        }
    }
}
