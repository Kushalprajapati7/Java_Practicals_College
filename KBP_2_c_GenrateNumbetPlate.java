public class KBP_2_c_GenrateNumbetPlate {
    public static void main(String[] args) {
        System.out.print("Your Number Plate is = ");
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=1;i<=3;i++)
        {
            char ch = alphabet.charAt((int)(Math.random()*10));
            System.out.print(ch);
        }
        System.out.print(" ");
        for(int j=1;j<=4;j++)
        {
            int num= (int)(Math.random()*10);
            System.out.print(num);
        }
    }
}
