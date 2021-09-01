package javaprogram;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class DepthFirstSearch {
	 private static LinkedList<Integer> adj [];
     public DepthFirstSearch(int v){
  	   adj = new LinkedList [v];
  	   for(int i=0;i<v;i++) {
  		   adj[i]= new LinkedList<Integer>();
  	   }
     }
     public void addedge(int source , int destination) {
  	   adj[source].add(destination);
  	   adj[destination].add(source);
     }
     @Override
     public String toString() {
  	   String res = "";
  	   for(int i=0;i<adj.length;i++) {
  		   res += i+"->"+adj[i]+"\n";
  		  }
		return res ;
  	   
     }
     public boolean dfsStack(int source , int destination) {
  	   boolean [] visted = new boolean[adj.length];
  	   visted[source]=true;
  	   Stack<Integer> st = new Stack<Integer>();
  	   st.push(source);
  	   while(!st.empty()) {
  		   int curr = st.pop();
  		   System.out.print(curr+" ");
  		   if(curr==destination) return true;
  		   for(int neighbour : adj[curr]){
  			   if(!visted[neighbour]) {
  				   visted[neighbour]=true;
  				   st.push(neighbour);
  			   }
  		   }   
  	   } 
  	   return false;
    }
     public boolean dfs(int source , int destination) {
    	 boolean [] vis = new boolean[adj.length];
    	 vis[source]=true;
    	 return dfsUtil(source ,destination,vis);
     }
	
	private boolean dfsUtil(int source, int destination, boolean[] vis) {
		if(source == destination) return true;
		System.out.print(source+" ");
		for(int neighbour : adj[source]) {
			if(!vis[neighbour]) {
				vis[neighbour]=true;
				boolean isConnected = dfsUtil(neighbour,destination,vis);
				if(isConnected) return isConnected;
			}
		}
		return false;
	}
	public static void main(String args[]) {
 	   Scanner scan = new Scanner(System.in);
 	   System.out.println("Enter the number of vertex and edges");
 	   int v=scan.nextInt();
 	   int e=scan.nextInt();
 	   DepthFirstSearch gh = new DepthFirstSearch(v);
 	   System.out.println("Enter "+e+" edges");
 	   for(int i=0;i<e;i++) {
 		   int source = scan.nextInt();
 		   int destination = scan.nextInt();
 		   gh.addedge(source, destination);
 	   }
 	   System.out.println(gh);
 	   System.out.println("Enter the source and destination");
 	   int source = scan.nextInt();
		   int destination = scan.nextInt();
		   System.out.println(gh.dfsStack(source,destination));
		   System.out.println(" ");
		   System.out.println(gh.dfs(source,destination));
		   scan.close();
    }
}
