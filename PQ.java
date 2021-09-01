package javaprogram;
import java.util.*;

public class PQ {
       public static void main(String args[]) {
    	   PriorityQueue<Integer> pq = new PriorityQueue<>();
    	   pq.add(13);
    	   pq.add(24);
    	   pq.add(345);
    	   pq.add(9);
           pq.add(21);
           pq.add(11);
           pq.add(10);
           pq.add(50);
           pq.remove();
    	   System.out.println(pq);
       }
}
