import java.util.Scanner;

public class KBP_2_d_SmallestFactor_IncresingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number for Smallest Factors : ");
        int num  = sc.nextInt();
        int i=2;
        while(num/i >1){
            if(num%i==0){
                System.out.print(i+",");
                num = num/i;
            }
            else{
                i++;
            }
        }
        System.out.print(num+",");
    }
}
