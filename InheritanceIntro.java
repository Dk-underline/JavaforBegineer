package javaprogram;
// Inheritance using "extends" command from Parent to Child class
class Phone{
	 Phone() {
		System.out.println("On the phone ");
	}
	 Phone(int a){
		 System.out.println("Phone is ready to use for :"+a);
	 }
	public void call() {
		System.out.println("Call From Contacts");
		}
	public void radio() {
		System.out.println("Welcome to Air India");
	}
	
}
class SmartPhone extends Phone{
	 SmartPhone() {
		 //super(0);
		System.out.println("Turn On SmartPhone");
	}
	 SmartPhone(int a){
		 super(a);
		 System.out.println("Turn On the SamrtPhone at :"+a+" o'clock");
	 }
    /*  public void Music(){
    	  System.out.println("Play some songs");
      }
      public void video(){
    	  System.out.println("Lets have some fun");
      }*/
}
public class InheritanceIntro {
       public static void main(String args[]) {
    	   SmartPhone vivo = new SmartPhone(9);
    	   vivo.call();
       }
}
