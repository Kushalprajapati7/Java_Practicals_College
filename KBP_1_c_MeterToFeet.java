//Write a program that reads a number in meters, converts it to feet, and displays the result.
import java.util.Scanner;

public class KBP_1_c_MeterToFeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of Meter in number ");
        Double meter = sc.nextDouble();
        Double meterTOfeet = 3.05;
        Double feet;

        feet = meter * meterTOfeet;
        System.out.println("The Value Of Feet = "+feet);
    }
}
