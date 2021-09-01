package javaprogram;
enum lecturs{
	MA202("Probability and Statistics"), ME312N("Dynamics of Machine"),ME579("Engineering Economics");
	private String schedule;
	lecturs(String value){
		this.schedule=value;
	}
	public String getValue() {
		 return schedule;
	}
}

public class Enumtype {
       public static void main(String args[]) {
    	   lecturs sem = lecturs.MA202;
    	   System.out.println(sem.name());
    	   System.out.println(sem.getValue());
    	   for(lecturs ssem : lecturs.values()) {
    		   System.out.println("Class room code : "+ssem);
    		   System.out.println("Subject name : "+ssem.getValue());
    	   }
    	   
       }
}
