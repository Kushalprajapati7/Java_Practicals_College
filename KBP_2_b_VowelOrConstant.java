import java.util.Scanner;

public class KBP_2_b_VowelOrConstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Letter ");
        String letter = sc.next();
        char ch = Character.toLowerCase(letter.charAt(0)); //it check only fist letter of the string
        if(!Character.isLetter(ch)){
            System.out.println("Invalid Input");
        }
        else
        {
            if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                System.out.println("You Entered Vowel");
            }
            else
            {
                System.out.println("You Enterd Consonant");
            }
        }

    }
}
