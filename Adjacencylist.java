package javaprogram;

//import java.util.ArrayList;
import java.util.*;
class Graph{
	LinkedList[] G;
   class Edge{
	  int destination ;
	  int weight;
	  public Edge(int u, int w){
		this.destination=u;
		this.weight=w;
	    }
	  @Override
	   public String toString(){
		 String result = "["+destination+","+weight+"]";
		 return result; 
	 }
   }
   public Graph(int n) {
	   G = new LinkedList[n];
	   for(int i=0;i<n;i++) {
		   G[i] = new LinkedList<Edge>();
	   }
   }
   public void addedge(int v,int u,int w) {
	   G[v].add(0,new Edge(u,w));
   }
   @Override
   public String toString() {
	   String result = "";
	   for(int i=0;i<G.length;i++)
		   result += i+"->"+G[i]+"\n";
	return result;
	   
   }
}
public class Adjacencylist {
       public static void main(String args[]) {
    	 Graph g = new Graph(5);
    	 g.addedge(0, 1, 2);
    	 g.addedge(0, 4, 2);
    	 g.addedge(1, 1, 1);
    	 g.addedge(1, 2, 3);
    	 g.addedge(1, 3, 2);
    	 g.addedge(1, 4, 3);
    	 g.addedge(3, 2, 4);
    	 g.addedge(3, 4, 1);
    	 System.out.println(g);
    }
}

