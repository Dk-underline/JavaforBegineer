package javaprogram;
import java.util.*;
public class Linked_List {
       public static void main(String args[]) {
    	   LinkedList <Integer> ll = new LinkedList<>();
    	   ll.add(1);
    	   ll.add(45);
    	   ll.add(18);
    	   ll.add(23);
    	   ll.addFirst(10);
    	   LinkedList <Integer> ll1 = new LinkedList<>(ll);
    	   ll1.add(99);
    	   ll1.add(333);
    	   System.out.println(ll);
    	   System.out.println(ll1);
    	   System.out.println(ll1.element());
    	   ll1.push(34);
    	   System.out.println(ll1);
    	   ll1.pop();
    	   System.out.println(ll1);
    	   Object [] a = ll1.toArray();
    	   System.out.println(a[3]);
       }
}
