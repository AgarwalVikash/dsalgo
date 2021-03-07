package graph;

import java.util.Stack;
import graph.matrixGraph.*;
public class DFSAppNonDirectional {
	
	static Graph theGraph = new Graph();
	static Stack<Integer> s=new Stack<Integer>();
	
	public static void main(String[] args) {
		
		theGraph.addVertex('A');
		theGraph.addVertex('B');
		theGraph.addVertex('C');
		theGraph.addVertex('D');
		theGraph.addVertex('E');
		theGraph.addVertex('F');
		
		theGraph.addNonDirectional(0,1);
		theGraph.addNonDirectional(1,2);
		theGraph.addNonDirectional(1,3);
		theGraph.addNonDirectional(3,0);
		theGraph.addNonDirectional(3,4);
		theGraph.addNonDirectional(4,5);
		theGraph.addNonDirectional(2,4);
		
		System.out.println("Visites: ");
		dfs();
		System.out.println();
		
	}

	public static void dfs() {
		theGraph.getVertexList()[0].setVisited(true);
		theGraph.displayVertex(0);
		s.push(0);
		while (!s.isEmpty()) {
			int v =theGraph.getAdjUnvisitedVertex(s.peek());
			if (v == -1) {
				s.pop();
			} else {
				theGraph.getVertexList()[v].setVisited(true);
				theGraph.displayVertex(v);
				s.push(v);
			}
		}
	}

}
