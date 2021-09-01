package javaprogram;

import java.util.Arrays;

public class Graphusingadjacencymatrix {
static int [][] graph = new int [5][5];
      static void addedge( int u, int v) {
    	   graph[u][v]= 1;
       }
     public static void main(String args[]) {
    	 for(int [] gh : graph)
    	  Arrays.fill(gh,0);
    	  addedge(0,1);
    	  addedge(0,4);
    	  addedge(1,1);
    	  addedge(1,2);
    	  addedge(1,3);
    	  addedge(1,4);
    	  addedge(3,2);
    	  addedge(3,4);
       System.out.println("Adjacency Matrix");
       for(int i=0;i<5;i++) {
    	   for(int j=0;j<5;j++) {
    		   System.out.print(graph[i][j]+" ");
    	   }
    	   System.out.println( " ");
       }
       }
}
