package graph;

import java.util.Stack;

public class CheckUnDirectedGraphConneted {

	static Graph theGraph = new Graph();
	static Stack<Integer> s = new Stack<Integer>();

	public static void main(String[] args) {
		theGraph.addVertex('A');
		theGraph.addVertex('B');
		theGraph.addVertex('C');
		theGraph.addVertex('D');
		theGraph.addVertex('E');
		theGraph.addVertex('F');
		theGraph.addVertex('G');

		theGraph.addNonDirectional(0, 1);
		theGraph.addNonDirectional(0, 2);
		theGraph.addNonDirectional(1, 3);
		theGraph.addNonDirectional(2, 4);
		theGraph.addNonDirectional(3, 5);
		theGraph.addNonDirectional(4, 5);
		theGraph.addNonDirectional(4, 6);

		System.out.println("Lets check graph is connected or not connected");
		checkConneted();

	}

	private static void checkConneted() {
		int visitedVetexCount=1;
		theGraph.getVertexList()[0].setVisited(true);
		s.push(0);
		while(!s.isEmpty()) {
			int v=theGraph.getAdjUnvisitedVertex(s.peek());
			if(v==-1){
				s.pop();
			}else {
				theGraph.getVertexList()[v].setVisited(true);
				s.push(v);
				visitedVetexCount++;
			}
		}
		if(theGraph.getNumber_of_vertex()==visitedVetexCount) {
			System.out.println("The graph is connected");
		}
		else {
			System.out.println("The graph is not conncted");
		}
	}

}
