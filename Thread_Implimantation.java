package javaprogram;
class MyThread_1 implements Runnable{
    int i=0;
    public void run() {
	while(i<10) {
		System.out.println("Jai Shree Ram");
		i++;
		System.out.println(i);
	   }
    }
}
class MyThread_2 implements Runnable{
    int i=0;
    @Override
    public void run() {
	while(i<10) {
		System.out.println("Jai Bajrang Bali");
		i++;
		System.out.println(i);
	}
    }
}
public class Thread_Implimantation {
	public static void main(String args[]) {
		MyThread_1 bullet1 = new MyThread_1();
		MyThread_2 bullet2 = new MyThread_2();
		Thread gun1=new Thread(bullet1);
		Thread gun2=new Thread(bullet2);
		gun1.start();
		gun2.start();
	}

}
