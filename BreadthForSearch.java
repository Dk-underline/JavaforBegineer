package javaprogram;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BreadthForSearch {
       private static LinkedList<Integer> adjlist [];
       public BreadthForSearch(int v){
    	   adjlist = new LinkedList [v];
    	   for(int i=0;i<v;i++) {
    		   adjlist[i]= new LinkedList<Integer>();
    	   }
       }
       public void addedge(int source , int destination) {
    	   adjlist[source].add(destination);
    	   adjlist[destination].add(source);
       }
       @Override
       public String toString() {
    	   String res = "";
    	   for(int i=0;i<adjlist.length;i++) {
    		   res += i+"->"+adjlist[i]+"\n";
    		  }
		return res ;
    	   
       }
       public int bfs(int source , int destination) {
    	   boolean [] visted = new boolean[adjlist.length];
    	   int [] parent = new int [adjlist.length];
    	   Queue<Integer> q = new LinkedList<>();
    	   q.add(source);
    	   parent[source]=-1;
    	   visted[source]=true;
    	   while(!q.isEmpty()) {
    		   int curr = q.poll();
    		   System.out.print(curr+" ");
    		   if(curr==destination) break;
    		   for(int neighbour : adjlist[curr]){
    			   if(!visted[neighbour]) {
    				   visted[neighbour]=true;
    				   parent[neighbour]=curr;
    				   q.add(neighbour);
    			   }
    		   }
    		   
    	   }
    	   System.out.println(" ");
    	   int dis=0;
    	   int curr = destination;
    	   while(parent[curr]!=-1) {
    		   System.out.print(curr+" ");
    		   curr  = parent[curr];
    		   dis++;
    	   }
    	   System.out.println(" ");
    	  return dis; 
       }
       public static void main(String args[]) {
    	   Scanner scan = new Scanner(System.in);
    	   System.out.println("Enter the number of vertex and edges");
    	   int v=scan.nextInt();
    	   int e=scan.nextInt();
    	   BreadthForSearch gh = new BreadthForSearch(v);
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
		   System.out.println(gh.bfs(source,destination));
		   scan.close();
       }
}
