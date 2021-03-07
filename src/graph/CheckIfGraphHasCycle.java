package graph;

import graph.adjacencyListGraph.Graph;

//check if undirected graph has cycle
public class CheckIfGraphHasCycle {

	public static void main(String args[]) {
		int nodes = 8;
		Graph g = new Graph(nodes);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 7);
		g.addEdge(3, 4);
		g.addEdge(4, 5);
		g.addEdge(5, 6);
		g.addEdge(7, 4);
		System.out.println("Graph has cycle "+checkIfGraphHasCycle(g));
	}

	private static boolean checkIfGraphHasCycle(Graph g) {
		for (int i = 0; i < g.getNodes(); i++) {
			if(!g.getVisited()[i]) {
				if(dfs(g,i,-1)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean dfs(Graph g,int i, int parent) {
		
		g.getVisited()[i]=true;
		for(Integer child:g.getGraphList().get(i)) {
			if(!g.getVisited()[child]) {
				if(dfs(g,child,i)) {
					return true;
				}
			}else if(child!=parent){
				return true;
			}
		}
		return false;
	}
}
