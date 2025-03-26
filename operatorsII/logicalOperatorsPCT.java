
public class logicalOperatorsPCT {

    public static void main(String[] args) {
        // Task 1
        int creditScore = 600;
        int mimimumCreditScore = 700;
        int income = 40000;
        int minimumIncome = 50000;

        // used boolean so that logial NOT will have a sense
        boolean isAboveCreditScore = creditScore > mimimumCreditScore;
        boolean isAboveIncome = income > minimumIncome;

        if (isAboveCreditScore && isAboveIncome) {
            // Logical AND
            System.out.println("You are eligible.");
        } else if (isAboveCreditScore || isAboveIncome) {
            // Logical OR
            System.out.println("50/50 ka boss! Tignan muna natin haha.");
        } else if (!isAboveCreditScore && !isAboveIncome) {
            // Logical NOT
            System.out.println("Ay wala yan boss. Trabaho ka muna gar!");
        }

        // Task 2
        int x = 10;

        x += 5;
        System.out.println(x);
        x -= 3;
        System.out.println(x);
        x *= 2;
        System.out.println(x);
        x /= 4;
        System.out.println(x);
        x %= 3;
        System.out.println(x);

        double initialPrice = 100;
        double discount = 0.20;
        double tax = 0.10;

        // 1 - discount (.20) is equals to .80
        initialPrice *= (1 - discount);
        initialPrice *= (1 + tax);
        System.out.println(initialPrice);

        // Task 3
        int a = -1;
        int b = 10;

        // if both of them are positive, perform the operations stated in the course
        if (a >= 0 && b >= 0) {
            a += b;
            System.out.println(a);

            b = a *= 2;
            System.out.println(b);
            
        } else {
            System.out.println("Delete your OS.");
        }

    }
}
