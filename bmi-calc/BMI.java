
import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        int weight = scanner.nextInt();

        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("=== BMI Report ===");
        System.out.println("Your BMI: " + bmi);

        String result = (bmi < 18.5) ? "Underweight"
                : (bmi >= 18.5 && bmi < 24.9) ? "Normal"
                        : (bmi >= 25 && bmi < 29.9) ? "Overweight"
                                : "Obese";

        System.out.print("Health Status: " + result);
    }
}
