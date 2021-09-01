package javaprogram;

class Parent{
	Parent(){
		System.out.println("I am your Father");
	}
	Parent(String name){
		System.out.println("I an Father of "+name);
	}
	public void Member() {
		System.out.println("Leader of House");
	}
}
// Inheritance from super class to sub class 
class Child extends Parent{
	Child(){
		System.out.println("I am the naughty child");
	}
	Child(String name, String cname){
		super(cname);
		System.out.println("I am son of "+ name);
	}
	// Method Overriding 
	@Override
	public void Member() {
		System.out.println("I am the Youngest");
	}
	public void school() {
		System.out.println("I good School");
	}
}
public class MetrhodOverrid {
      public static void main(String args[]) {
    	 Parent a1= new Parent("Suresh"); 
    	a1.Member(); 
    	System.out.println();
    	Child a2=new Child("ram","rahul"); //Dynamic Memory Dispatch
    	a2.Member();
    	a2.school();
      }
}
