
public class relationalOperatorsPCT {

    public static void main(String[] args) {
        int x = 10, y = 11;

        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);

        if (x >= 10 && x <= 20) {
            System.out.println("Yes, " + x + " is within the range.");
        } else {
            System.out.println("No");
        }
    }
    }

