import java.util.Scanner;

public class KBP_2_e_GCD_Of_TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number : ");
        int first = sc.nextInt();
        System.out.println("Enter The Second Number : ");
        int second = sc.nextInt();
        System.out.println("The GCD Of " + first + " And " + second + " is = " + gcd(first, second));
    }
    public static int gcd(int num1, int num2)
    {
        if(num2==0){
            return num1;
        }
        return gcd(num2, num1%num2);
    }
}
