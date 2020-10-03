package graph;

import java.util.Stack;

public class MSTApp {

	static Graph theGraph = new Graph();
	static Stack<Integer> s = new Stack<Integer>();

	public static void main(String[] args) {

		theGraph.addVertex('A');
		theGraph.addVertex('B');
		theGraph.addVertex('C');
		theGraph.addVertex('D');
		theGraph.addVertex('F');

		theGraph.addNonDirectional(0, 1);
		theGraph.addNonDirectional(0, 2);
		theGraph.addNonDirectional(0, 3);
		theGraph.addNonDirectional(0, 4);
		theGraph.addNonDirectional(1, 2);
		theGraph.addNonDirectional(1, 3);
		theGraph.addNonDirectional(1, 4);
		theGraph.addNonDirectional(2, 3);
		theGraph.addNonDirectional(2, 4);
		theGraph.addNonDirectional(3, 4);
		System.out.println("Display MST");
		mstApp();

	}

	private static void mstApp() {
		theGraph.getVertexList()[0].setVisited(true);
		int current = 0;
		s.push(0);
		while (!s.isEmpty()) {
			int v = theGraph.getAdjUnvisitedVertex(s.peek());
			if (v == -1)
				s.pop();
			else {
				theGraph.displayVertex(current);
				theGraph.displayVertex(v);
				System.out.println();
				s.push(v);
				theGraph.getVertexList()[v].setVisited(true);
				current=v;
			}
		}
	}
}
