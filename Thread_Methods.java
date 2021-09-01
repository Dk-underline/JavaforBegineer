package javaprogram;
class Thread1 extends Thread{
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Jai Shree  Ram");
			try {
		    	 Thread.sleep(10);
		    	}
		    	catch (Exception e) {
		    		System.out.println(e);
		    	}
			i++;
		}
	}
}
class Thread2 extends Thread{
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Jai Bajrang Bali");
			i++;
		}
	}
}
public class Thread_Methods {
    public static void main(String args[]) {
    	Thread1 obj1 = new Thread1();
    	Thread2 obj2 = new Thread2();
    	obj1.start();
    	try {
       	 obj1.join();
       	}
       	catch (Exception e) {
       		System.out.println(e);
       	}
    	obj2.start();
    	
    }
}
