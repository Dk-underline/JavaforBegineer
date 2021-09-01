package javaprogram;

class Student{
	public int sid;
	public String sname;
	public String sbranch;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void getDetails(){
		System.out.println(this.sid);
		System.out.println(this.sname);
		System.out.println(this.sbranch);
	}
}
public class CustomClass {
	public static void main(String args[]) {
	  Student dk=new Student();
      dk.sid=07;
      dk.sname="Rahul";
      dk.sbranch="Mec";
      dk.getDetails();
      dk.setSid(14);
      dk.getDetails();
	}
       
}
