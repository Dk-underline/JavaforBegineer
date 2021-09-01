package javaprogram;
import java.util.*;
public class Array_List {
	public static void main(String args[]) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(10);
		System.out.println(l1.get(0));
		System.out.println(l1.size());
		l1.add(7);
		 Object l2 = l1.clone();
		l1.clear();
		System.out.println(l2);
		l1.add(9);
		System.out.println(l1.size());
		l1.add(0);
		l1.add(45);
		l1.add(87);
		l1.set(2,11);
		System.out.println(l1.get(0));
		System.out.println(l1);
		System.out.println(l1.isEmpty());
	}

}
