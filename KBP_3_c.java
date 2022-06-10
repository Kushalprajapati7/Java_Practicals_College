/*Write a program that creates an Array List and adds a Loan object , a Date object
, a string, and a Circle object to the list, and use a loop to display all elements in
the list by invoking the object’s to String() method. */ 

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class KBP_3_c {
    public static void main(String[] args) {
        ArrayList<Object> a1 = new ArrayList<Object>(); 
       Loan l = new Loan();
       Date d = new Date(System.currentTimeMillis());
       String s = new String("Kushal B. Prajapati");
       Circle c = new Circle();
        a1.add(l);
        a1.add(d);
        a1.add(s);
        a1.add(c);
        for(int i=0; i<a1.size();i++){
            System.out.println(a1.get(i).toString());
        }

    }

}

