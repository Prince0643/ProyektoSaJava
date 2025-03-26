
import java.util.Scanner;

public class SumOfNumbersPCT {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Not a positive integer.");
        } else {
            int i = 0;
            int result = 0;
            
            while (i < num) {
                i++;
                result += i;
            }

            System.out.println("The sum of natural numbers from 1 to 10 is: " + result);
        }
    }
}
