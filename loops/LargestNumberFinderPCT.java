
import java.util.Scanner;

public class LargestNumberFinderPCT {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int finalNum = -1;
        int inputNum = 0;
        int largestNum = Integer.MIN_VALUE;

        while (inputNum != finalNum) {
            System.out.print("Enter a number (-1 to stop): ");
            inputNum = scanner.nextInt();

            if (inputNum > largestNum) {
                largestNum = inputNum;
            }
        }

        System.out.println("The largest number entered is: " + largestNum);

    }
}
