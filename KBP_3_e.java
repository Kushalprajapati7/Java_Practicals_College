import java.util.Scanner;

public class KBP_3_e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Rollno of Student :- ");
        int roll = sc.nextInt();
        System.out.println("Enter the Name Of Student :- ");
        String name = sc.next();
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Result e1 = new Result(roll, name, arr);
        for (int i = 0; i < 6; i++)
            System.out.println(e1.marksSubj[i]);

        System.out.println("The Total Marks = " + e1.settotal());
        System.out.println("The Percentage is = " + ((e1.settotal()) / 6f));
    }
}

class Student {
    int rollNo;
    String Name;

    Student(int r, String n) {
        rollNo = r;
        Name = n;
    }

}

class Exam extends Student {
    int[] marksSubj = new int[6];

    Exam(int r, String n, int[] marks) {
        super(r, n);
        marksSubj = marks;
    }

}

class Result extends Exam {
    int total;

    Result(int r, String n, int[] marks) {
        super(r, n, marks);
    }

    int settotal() {
        for (int i = 0; i < marksSubj.length; i++)
            total = total + marksSubj[i];
        return total;
    }

}