package javaprogram;

class Base1{
	public Base1() {
		System.out.println("It is Base1 class contstructor");
	}
	public String name;
	public Base1(String a) {
		System.out.println("I am the "+ a +"Constructor");
		this.name=a;
	}
	 
}
public class Constructor {
       public static void main(String args[]) {
    	   Base1 x=new Base1("Rohan");
    	   System.out.println(x.name);
       }
}
