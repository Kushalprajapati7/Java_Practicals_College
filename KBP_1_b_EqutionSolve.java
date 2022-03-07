/*Write a program that solves the following equation and displays the value x and
y: 1) 3.4x+50.2y=44.5 2) 2.1x+.55y=5.9 (Assume Cramer’s rule to solve equation
ax+by=e x=ed-bf/ad-bc cx+dy=f y=af-ec/ad-bc ) */
public class KBP_1_b_EqutionSolve {
    public static void main(String[] args) {
        float a=3.4F;
        float b=50.2F;
        float e=44.5F;
        float c=2.1F;
        float d=0.55F;
        float f=5.9F;
        float x,y;

        x=((e*d)-(b*f))/((a*d)-(b*c));
        y=((a*f)-(e*c))/((a*d)-(b*c));

        System.out.println("The Value Of x = "+ x);
        System.out.println("The Value Of y = "+ y);


    }
}
