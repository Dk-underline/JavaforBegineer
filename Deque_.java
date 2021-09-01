package javaprogram;
import java.util.*;

public class Deque_ {
     public static void main(String args[]) {
    	 Deque<String> dq= new ArrayDeque<>();
    	 Deque<Integer> deck = new LinkedList<>();
    	 dq.addFirst("Ram");
    	 dq.offerFirst("Bharat");
    	 dq.offer("Laxman");
    	 dq.add("Shatrugan");
    	 deck.add(1);
    	 deck.addLast(2);
    	 deck.add(3);
    	 deck.offerFirst(0);
    	 System.out.println(deck.element());
    	 System.out.println(dq);
    	 System.out.println(deck);
    	 
     }
}
