
public class modulusOperatorPCT {

    public static void main(String[] args) {
        int x = 10, y = 3;

        int rem = x % y;
        System.out.println(rem);

        if (x % y == 0){
            System.out.println("Yes, it is divisable");
        } else {
            System.out.println("No, it is not divisable");
        }
    }
}
