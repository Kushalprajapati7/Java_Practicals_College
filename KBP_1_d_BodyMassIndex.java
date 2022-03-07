/* Body Mass Index (BMI) is a measure of health on weight. It can be calculated by
taking your weight in kilograms and dividing by the square of your height in
meters. Write a program that prompts the user to enter a weight in pounds and
height in inches and displays the BMI.
Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters. */

import java.util.Scanner;
public class KBP_1_d_BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Weight In Pounds ");
        Double weight = sc.nextDouble();
        System.out.println("Enter Your Height In Inches ");
        Double height = sc.nextDouble();

        Double weight_in_kg = weight*0.45359237;
        Double height_in_meter = height*0.0254;

        Double bmi; //bmi = Body Mass Index
        bmi = (weight_in_kg)/((height_in_meter)*(height_in_meter));

        System.out.println("Your Body Mass Index(BMI) Is "+ bmi);
    }
}
