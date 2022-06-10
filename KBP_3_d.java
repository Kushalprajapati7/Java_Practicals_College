import java.util.Scanner;

public class KBP_3_d {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter The Any Number");
        String str = sc.next();

        int i = str.indexOf(".") ;
        String integer = str.substring(0, i);
        String fractional = str.substring(i+1, str.length());

        System.out.println("The integer Part = "+integer);
        System.out.println("The Fractional Part = "+fractional);
       
    }
}
