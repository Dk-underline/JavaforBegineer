package javaprogram;
// Interface declaration 
interface PM_Schema{
	void PMKVY();
	void PM_WDS();
}
interface Co_Bank{
	void loan_Aprove();
	void loan_Collect();
}
//Implementation of interfaces
// We can implement multiple interfaces
class GSS implements PM_Schema , Co_Bank{
	public void PMKVY() {
		System.out.println("Pradhan Mantri Kushal Vikas Yojna");
	}
	public void PM_WDS(){
		System.out.println("Wheat Distribution Schema");
	}
	public void loan_Aprove() {
		System.out.println("Loan amount are Distributed");
	}
	public void loan_Collect() {
		System.out.println("Loan amount has been collected");
	}
	
}
public class Interfaces {
	public static void main(String args[]) {
		Co_Bank A1 = new GSS(); // It is possible to create reference of the interface but not create and object
		A1.loan_Collect();
		GSS A2 = new GSS();
		System.out.println();
		A2.loan_Aprove();
		A2.PM_WDS();
		A2.PMKVY();
	}

}
