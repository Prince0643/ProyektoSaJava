
import java.util.Scanner;

public class ManualNumberConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        String binary = "";
        int tempDecimal = decimalNumber;
        while (tempDecimal > 0) {
            binary = (tempDecimal % 2) + binary; 
            tempDecimal /= 2;
        }

        String octal = "";
        tempDecimal = decimalNumber;
        while (tempDecimal > 0) {
            octal = (tempDecimal % 8) + octal;
            tempDecimal /= 8;
        }

        String hexadecimal = "";
        tempDecimal = decimalNumber;
        while (tempDecimal > 0) {
            int remainder = tempDecimal % 16;
            if (remainder < 10) {
                hexadecimal = remainder + hexadecimal;
            } else {
                hexadecimal = (char) ('A' + (remainder - 10)) + hexadecimal;
            }
            tempDecimal /= 16;
        }

        // Display the results
        System.out.println("\n=== Number System Conversions ===");
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);

        scanner.close();
    }
}
