package graph;

import java.util.Stack;

public class CheckStronglyConnected {

	static Graph theGraph = new Graph();
	static Stack<Integer> s = new Stack<Integer>();

	public static void main(String[] args) {
		theGraph.addVertex('A');
		theGraph.addVertex('B');
		theGraph.addVertex('C');
		theGraph.addVertex('D');

		theGraph.addEdgeDirectional(0, 1);
		theGraph.addEdgeDirectional(1, 2);
		theGraph.addEdgeDirectional(3, 2);

		checkStronglyConnected();
	}

	private static void checkStronglyConnected() {

		for (int i = 0; i < theGraph.getNumber_of_vertex(); i++) {
			theGraph.getVertexList()[i].setVisited(true);
			s.push(i);
			while (!s.isEmpty()) {
				int v = theGraph.getAdjUnvisitedVertex(s.peek());
				if (v == -1) {
					s.pop();
				} else {
					theGraph.getVertexList()[v].setVisited(true);
					s.push(v);
				}
			}
			for(int j=0;j<theGraph.getNumber_of_vertex();j++) {
				if(!theGraph.getVertexList()[j].isVisited()) {
					System.out.println("The graph is not connected");
					return;
				}
				else {
					theGraph.getVertexList()[j].setVisited(false);
				}
			}
		}
		System.out.println("The graph is connected");
		
	}

}
