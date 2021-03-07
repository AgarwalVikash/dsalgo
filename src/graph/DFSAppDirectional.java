package graph;

import java.util.Stack;

import graph.matrixGraph.*;
public class DFSAppDirectional {
	
	static Graph theGraph = new Graph();
	static Stack<Integer> s=new Stack<Integer>();
	
	public static void main(String[] args) {
		
		theGraph.addVertex('A');
		theGraph.addVertex('B');
		theGraph.addVertex('C');
		theGraph.addVertex('D');
		theGraph.addVertex('E');
		theGraph.addVertex('F');
		
		theGraph.addEdgeDirectional(0,1);
		theGraph.addEdgeDirectional(1,2);
		theGraph.addEdgeDirectional(1,3);
		theGraph.addEdgeDirectional(3,0);
		theGraph.addEdgeDirectional(3,4);
		theGraph.addEdgeDirectional(4,5);
		theGraph.addEdgeDirectional(2,4);
		
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
