package javaprogram;
import java.util.*;
@FunctionalInterface // Contain only one method
interface Olympic{
	void jevlin();
}
//Comparable use campareTo method to sort the list and single sorting sequance
class Student_ implements Comparable<Student_>{
	int roll;
	String name;
	public Student_(int roll1 , String name1) {
		this.roll = roll1;
		this.name = name1;
	}
	
	@Override
	public String toString() {
		return "Student_ [roll=" + roll + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student_ that) {
		return (this.roll-that.roll);
	}
	
}
public class Lambda_Expression {
 public static void main(String args[]) {
	 Olympic india = ()->{
		 System.out.println("India have its first Meadel In Track And Field");
	 };
	 india.jevlin();
	 List <Student_> list = new ArrayList<>();
	 list.add(new Student_ (11 ,"Aman"));
	 list.add(new Student_ (7 ,"Kamal"));
	 list.add(new Student_ (6 ,"Ram"));
	 list.add(new Student_ (2 ,"Bavana"));
	 list.add(new Student_ (8 ,"Cahat"));
	 list.add(new Student_ (3 ,"Charan"));
	 list.add(new Student_ (4 ,"Darsit"));
	 list.add(new Student_ (5 ,"Ekta"));
	 System.out.println(list);
	// Collections.sort(list,Collections.reverseOrder());
	 // Comparator is multiple sorting seqance and use compare method to sort
//	 Collections.sort(list,new Comparator<Student_>(){
//
//
//		@Override
//		public int compare(Student_ O1, Student_ that) {
//			return O1.name.compareTo(that.name);
//		}
//		
//	 });
	 Collections.sort(list,(o1,o2)-> o1.name.compareTo(o2.name));
	 System.out.println(list);
 }
}
