package javaprogram;
class Thread_1 extends Thread{
	Thread_1(String n){
		super(n);
	}
	/*public void run() {
		int i=0;
		while(i<10) {
			System.out.println("Jai Bajrang Bali");
			i++;
		}
	}*/
}

public class Thread_Constructor {
      public static void main(String args[]) {
    	  Thread_1 obj = new Thread_1("Ram");
    	  obj.start();
    	  System.out.println(obj.getName());
    	  System.out.println(obj.getId());
      }
}
