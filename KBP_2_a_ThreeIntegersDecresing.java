import java.util.Scanner;

/* Write a program that prompts the user to enter three integers and display the
integers in decreasing order. */
public class KBP_2_a_ThreeIntegersDecresing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Value ");
        int first = sc.nextInt();
        System.out.println("Enter The Second Value ");
        int second = sc.nextInt();
        System.out.println("Enter The third Value ");
        int third = sc.nextInt();

        if(first>second && second>third)
            System.out.println(" " +first +" " +second +" " +third);
        else if(first>third && third>second)
            System.out.println(" "+first +" " +third +" " +second);
        else if(second>first && first>third)
            System.out.println(" "+second +" " +first +" " +third);
        else if(second>third && third>first)
            System.out.println(" "+second +" " +third +" " +first);
        else if(third>first && first>second)
            System.out.println(" "+third +" " +first +" " +second);
        else
            System.out.println(" "+third +" " +second +" "+first); 

    }
}
