import java.text.ParseException;
import java.util.Scanner;

public class KBP_4_b {
    public static void main(String[] args) {
        Bin2Dec B2D = new Bin2Dec();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number:");
        B2D.val=sc.next();
        try{
        System.out.println("The Decimal Number: "+B2D.convB2D());
        }catch(NumberFormatException e){
            System.out.println("Enter valid binary number!");
        }
    }    
}
class Bin2Dec{
    String val;
    int convB2D()throws NumberFormatException{
        int dec = Integer.parseInt(val,2);
        return dec;
    }
}

