import java.util.Random;

public class KBP_3_a{
    public static void main(String[] args) {
        Random rand = new Random(1000);
        for(int i=0;i<=100;i++)
        {
            System.out.print(" "+rand.nextInt(49));
        }
    }
}