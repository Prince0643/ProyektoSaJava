
import java.util.Scanner;

public class ElectricityBillPCT {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of units consumed: ");
        int units = scanner.nextInt();

        double totalBill = 0.0;

        if (units <= 100) {
            totalBill = units * 1.50;
        } else if (units <= 300) {
            totalBill = (100 * 1.50) + ((units - 100) * 2.50);
        } else {
            totalBill = (100 * 1.50) + (200 * 2.50) + ((units - 300) * 3.50);
        }

        System.out.println("Total bill: " + totalBill);

        scanner.close();
    }
}
