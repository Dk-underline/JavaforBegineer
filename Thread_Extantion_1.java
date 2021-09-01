package javaprogram;
class MyThread1 extends Thread{
     int i=0;
     public void run() {
	while(i<100) {
		System.out.println("Jai Shree Ram");
		i++;
		System.out.println(i);
	}
     }
}
class MyThread2 extends Thread{
    int i=0;
    @Override
    public void run() {
	while(i<100) {
		System.out.println("Jai Bajrang Bali");
		i++;
		System.out.println(i);
	}
    }
}
public class Thread_Extantion_1 {
     public static void main(String args[]) {
    	 MyThread1 Saffron = new MyThread1();
    	 MyThread2 Marron = new MyThread2();
    	 Saffron.start();
    	 Marron.start();
    	
     }
}
