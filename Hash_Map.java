package javaprogram;
import java.util.*;
public class Hash_Map {
	 /*static void hascode(int [] arr) {
		 HashMap <Integer,Integer> map = new HashMap<>();
		 for(int ele : arr) {
			 map.compute(ele%10, ele/10);
		 }
	 }*/
       public static void main (String args[]) {
    	   Scanner scan = new Scanner(System.in);
    	   HashMap<Integer,Integer> hm = new HashMap<>();
    	   hm.put(3,111);
    	   System.out.println(hm);
    	   hm.put(4,673);
   	       hm.put(7,356);
    	   if(hm.containsKey(4)) {
    		   System.out.println(hm.get(7));
    		   System.out.println(hm.get(4));
    	   }
    	   hm.put(4,536);
    	    System.out.println(hm);
    	   int [] arr = new int [10];
    	   for(int i=0;i<10;i++) {
    		   arr[i]=scan.nextInt();
    	   }
    	   for(int i=0;i<10;i++) {
    		   System.out.println(arr[i]);
    	   }
    	   scan.close();
       }
}
