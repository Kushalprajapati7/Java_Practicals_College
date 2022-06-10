import java.util.*;
public class KBP_4_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SqureRoot n = new SqureRoot();
        System.out.println("Enter the number: ");
        n.val = sc.nextInt();
        try {
            System.out.println("The Squre Root : " + n.mySqrt());
        } catch (NegativeValue e) {
            System.out.println(e);
        }

    }
}

class SqureRoot {
    int val;

    int mySqrt() throws NegativeValue {
        if (val < 0) {
            throw new NegativeValue();
        }
        return (val * val);
    }
}

class NegativeValue extends Exception {

}
