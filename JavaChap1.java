package javaprogram;
import java.util.Scanner;
public class JavaChap1 {
       public static void main(String args[]) {
    	   Scanner impo =new Scanner(System.in);
    	   String name=impo.nextLine();
    	   int a=impo.nextInt();
    	   impo.close();
    	   System.out.print(a);
    	   System.out.println();
    	   System.out.print(name);
       }
}
