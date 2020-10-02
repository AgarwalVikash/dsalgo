package graph;

public class DFSAppDirectional {
	public static void main(String[] args) {
		Graph theGraph = new Graph();
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
		theGraph.dfs();
		System.out.println();
		
	}
}
