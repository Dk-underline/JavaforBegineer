package javaprogram;
// Abstract class contains abstract methods;
abstract class Bike{
	public void two_wheeler() {
		System.out.println("Bike Known as Two Wheeler");
	}
	public void horn_blow() {
		System.out.println("Haardy Sindhu - Horn Blow Kar ta");
	}
// Abstract method declaration using 'abstract' keyword without implementation; 	
	abstract void braek();
	abstract void gear();
	abstract void maxspeed();	
}
class Splender extends Bike{
	public void perfomance() {
		System.out.println("It have good perfomance");
	}
   	 void braek(){
   		System.out.println("It has ordinary break system");
   	}
	void gear(){
		System.out.println("It has 4 gear cluch box");
	}
	void maxspeed(){
	   System.out.println("Have Max Speed Upto 80km/h ");	
	}
}
public class AbstracClass {
	public static void main(String args[]) {
		Splender h = new Splender();
		h.two_wheeler();
		h.maxspeed();
		h.braek();
		h.gear();
		h.perfomance();
		h.horn_blow();
		System.out.println();
		// We can create a reference of the the abstract class but not the object
		Bike honda= new Splender();
		honda.braek();
		honda.horn_blow();
	}

}
