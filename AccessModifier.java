package javaprogram;

class Employee {
	public int eid;
	public String ename;
	public String department;
	private int eage; // Acessable only in class 
	private String emailid; // Acessable only within class 
	protected int a=20; //Acessable in packages,class and subclass 
	int b=200;//// Acessable only in class and packeges
	// private int c=30;
	public void seteage(int a) {
		eage=a;
	}
	public int geteage() {
		return this.eage;
	}
	public void setemailid(String a) {
		emailid=a;
	}
	public String getemailid() {
		return this.emailid;
	}
	public void getDetails(){
		System.out.println(this.eid);
		System.out.println(this.ename);
		System.out.println(this.department);
		System.out.println(this.geteage());
		System.out.println(this.getemailid());
	}
}
public class AccessModifier {
	public static void main(String args[]) {
		Employee x= new Employee();
		x.eid=13;
		x.ename="Sabeel";
		x.department="Technical";
		x.seteage(20);
		x.setemailid("sabeel.cer19@itbhu.ac.in");
		System.out.println(x.geteage());
		System.out.println(x.getemailid());
		System.out.println( );
		x.getDetails();
		System.out.println(x.a);
		System.out.println(x.b);
		//System.out.println(x.c);
	}
}
