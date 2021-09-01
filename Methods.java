package javaprogram;


public class Methods {
	static void sum (int a,int b) {
		System.out.println(a+b);
	}
	 void sum (int a,int b,int c) { // Cannot call it directly we need to create a class object to call the function 
		System.out.println(a+b+c);
	}
	 // Method OverLoadinng
	static int sum(int a,int...arr) {
		int result=a;
		for(int ele:arr) {
			result +=ele;
		}
		return result;
	}
	public static void main(String args[]) {
		 sum(10,20);
		 Methods obj=new Methods();
		 obj.sum(10, 30, 10);
		 int ans = sum(10,30,20,30,50,60,70);
		 System.out.println(ans);
	}

}
