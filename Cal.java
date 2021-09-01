package javaprogram;
import java.util.*;

public class Cal {
       public static void main(String args[]) {
    	   Calendar c = Calendar.getInstance();
    	   System.out.println(c.get(Calendar.DATE));
    	   System.out.println(c.get(Calendar.HOUR_OF_DAY));
    	   System.out.println(c.get(Calendar.MINUTE));
    	   System.out.println(c.get(Calendar.HOUR));
    	   GregorianCalendar gc = new GregorianCalendar();
    	   System.out.println(gc.getTimeZone());
    	   System.out.println(gc.isLeapYear(2021));
       }
}
