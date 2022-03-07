import java.util.Scanner;

public class KBP_2_f_ReverseTenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[10];

        System.out.println("Enter Any Ten Numbers");
        for (int i=0 ;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        reverse(a);
        System.out.println("The Numbers in reverse order are : ");
        for(int i=0;i<a.length;i++){
            System.out.println(" "+a[i]);
        }
    }
    public static void reverse(int [] arr){
        for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--)
        {
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
        }
    }
}
