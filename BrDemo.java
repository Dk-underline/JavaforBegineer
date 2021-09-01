package javaprogram;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BrDemo {
       public static void main(String args[] )throws IOException {
    	   InputStreamReader isr = new InputStreamReader(System.in);
    	   BufferedReader br = new BufferedReader(isr);
    	   System.out.print("Enter a String :");
    	   String s=br.readLine();
    	   System.out.println(s);
    	   System.out.print("Enter a number :");
    	   int a=br.read();
    	   System.out.println(a);
    	   
    	   
       }
}
//This way we can read the keyboard input in java.