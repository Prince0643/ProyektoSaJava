
import java.util.Scanner;

public class PasswordCheckerPCT {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "java123";
        String input;

        do {
            System.out.print("Enter password: ");
            input = scanner.nextLine();

            if (input.equals(password)) {
                System.out.println("Access granted!");
            } else {
                System.out.println("Incorrect password. Try again.");
            }

        } while (!input.equals(password));
    }
}
