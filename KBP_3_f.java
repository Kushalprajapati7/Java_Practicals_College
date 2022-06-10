import java.io.*;
import java.util.Scanner;
 
class KBP_3_f {
    public static void main (String[] args) {
       
        String str= "GEC PATAN", nstr="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println("GEC PATAN"); //Example word
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);


      String s = str.replace("EC", "OV");
      //String fi = s.replace('C', 'V');
      System.out.println(s);
    }
}