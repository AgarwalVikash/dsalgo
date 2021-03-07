package graph;

import java.util.LinkedList;
import java.util.Queue;

import graph.matrixGraph.*;
public class BFSAppDirectional {
	static Queue<Integer> q = new LinkedList<Integer>();
	static Graph theGraph = new Graph();

	public static void main(String[] args) {
		theGraph.addVertex('A');
		theGraph.addVertex('B');
		theGraph.addVertex('C');
		theGraph.addVertex('D');
		theGraph.addVertex('E');
		theGraph.addVertex('F');

		theGraph.addEdgeDirectional(0, 1);
		theGraph.addEdgeDirectional(1, 2);
		theGraph.addEdgeDirectional(1, 3);
		theGraph.addEdgeDirectional(3, 0);
		theGraph.addEdgeDirectional(3, 4);
		theGraph.addEdgeDirectional(4, 5);
		theGraph.addEdgeDirectional(2, 4);

		System.out.println("Visites: ");
		bfs();
		System.out.println();

	}

	private static void bfs() {
		theGraph.getVertexList()[0].setVisited(true);
		theGraph.displayVertex(0);
		q.offer(0);
		while (!q.isEmpty()) {
			int j = q.peek();
			int v = theGraph.getAdjUnvisitedVertex(j);
			if (v == -1)
				q.poll();
			else {
				theGraph.getVertexList()[v].setVisited(true);
				theGraph.displayVertex(v);
				q.offer(v);
			}
		}
	}
}
