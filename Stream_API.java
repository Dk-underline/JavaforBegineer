package javaprogram;
import java.util.*;
import java.util.stream.Collectors;
public class Stream_API {
       public static void main(String args[]) {
//    	   Scanner read = new Scanner(System.in);
//    	   List<Integer> cost = new ArrayList<>();
//    	   cost.add(1000);
//    	   cost.add(2000);
//    	   cost.add(3000);
//    	   cost.add(4000);
//    	   cost.add(5000);
//    	   List<Double> newcost = cost.stream().map(x -> 1.2*x).collect(Collectors.toList());
//    	   System.out.println(newcost);
    	   List<String> names = new ArrayList<>();
    	   names.add("Ram Nagar");
    	   names.add("Lokesh Nagar");
    	   names.add("laxman Nagar");
    	   names.add("Manish Nagar");
    	   names.add("Ramesh Nagar");
    	   names.add("Yogender Meena");
    	   names.add("Rahul Meena");
    	   names.add("Mahaveer Meena");
    	   List<String> sirname = names.stream().filter(s -> s.endsWith("Nagar")).filter(s -> s.contains("sh")).collect(Collectors.toList());
    	   System.out.println(names);
    	   System.out.println(" ");
    	   System.out.println(sirname);
    	   
       }
}
