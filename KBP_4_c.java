import java.util.Scanner;

public class KBP_4_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chose your polygone:");
        System.out.println("1.Squre");
        System.out.println("2.Rectangle");
        int n = sc.nextInt();
        if (n == 1) {
            Squre p1 = new Squre(6);
            p1.calArea();
            p1.calPeri();
            p1.diaplay();
        } else {
            Rectangle p2 = new Rectangle(2, 3);
            p2.calArea();
            p2.calPeri();
            p2.diaplay();
        }

    }
}

interface Polygone {
    void calArea();

    void calPeri();

    void diaplay();
}

class Squre implements Polygone {
    float side;
    float area;
    float peri;

    Squre(float side) {
        this.side = side;
    }

    public void calArea() {
        area = side * side;
    }

    public void calPeri() {
        peri = 4 * side;
    }

    public void diaplay() {
        System.out.println("The area of your polygon: " + area);
        System.out.println("The perimeter of your polygon: " + peri);
    }
}

class Rectangle implements Polygone {
    float bre;
    float len;
    float area;
    float peri;

    Rectangle(float len, float bre) {
        this.len = len;
        this.bre = bre;
    }

    public void calArea() {
        area = bre * len;
    }

    public void calPeri() {
        peri = 2 * (len + bre);
    }

    public void diaplay() {
        System.out.println("The area of your polygon: " + area);
        System.out.println("The perimeter of your polygon: " + peri);
    }
}
