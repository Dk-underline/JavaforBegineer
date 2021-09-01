package javaprogram;
import java.util.*;
public class Hash_Set {
      public static void main(String args[]) {
    	  HashSet<Integer> hs = new HashSet<>();
    	  hs.add(23);
    	  hs.add(49);
    	  hs.add(13);
    	  hs.add(346);
    	 // hs.add(13);
    	  System.out.println(hs);
    	  System.out.println(hs.contains(23));
      }
}
