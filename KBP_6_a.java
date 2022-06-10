import java.io.*;
import java.util.Scanner;

class KBP_6_a {
    public static void main(String[] args) {
        try (
                PrintWriter pw = new PrintWriter(new FileOutputStream(new File("123.txt"), true));) {
            for (int i = 0; i < 150; i++) {
                pw.print((int) (Math.random() * 100) + " ");
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Cannot create the file.");
            fnfe.printStackTrace();
        }
    }
}