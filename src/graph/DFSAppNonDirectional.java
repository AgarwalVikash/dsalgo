package graph;

public class DFSAppNonDirectional {
	public static void main(String[] args) {
		Graph theGraph = new Graph();
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
		theGraph.dfs();
		System.out.println();
		
	}
}
