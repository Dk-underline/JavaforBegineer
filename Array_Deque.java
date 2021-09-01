package javaprogram;
import java.util.*;

public class Array_Deque {
      public static void main(String args[]) {
    	  ArrayDeque<Integer> ad1 = new ArrayDeque<Integer>();
    	  ad1.add(2);
    	  ad1.add(5);
    	  ad1.add(3);
    	  ArrayDeque<Integer> ad2 = new ArrayDeque<Integer>();
    	  ad2.addAll(ad1);
    	  ad2.add(7);
    	  ad2.add(11);
    	  ad1.add(11);
    	  //System.out.println(ad1.poll());
    	  //System.out.println(ad2.peek());
    	  System.out.println(ad1.pop());
    	  System.out.println(ad1.getFirst());
    	  System.out.println(ad2.getLast());
    	  System.out.println(ad2.size());
    	  System.out.println(ad1.size());
    	  ad2.clear();
    	  System.out.println(ad2.contains(5));
    	  
    	  
      }
}
