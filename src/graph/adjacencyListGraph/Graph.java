package graph.adjacencyListGraph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	private List<List<Integer>> graphList;
	private int nodes;
	private boolean visited[];

	public List<List<Integer>> getGraphList() {
		return graphList;
	}

	public void setGraphList(List<List<Integer>> graphList) {
		this.graphList = graphList;
	}

	public boolean[] getVisited() {
		return visited;
	}

	public void setVisited(boolean[] visited) {
		this.visited = visited;
	}

	public Graph(int nodes) {
		graphList = new ArrayList<>();
		visited=new boolean[nodes];
		this.setNodes(nodes);
		for (int i = 0; i < nodes; i++) {
			graphList.add(i, new ArrayList<>());
		}
	}

	public void addEdge(int a, int b) {
		graphList.get(a).add(b);
		graphList.get(b).add(a);
	}

	public int getNodes() {
		return nodes;
	}

	public void setNodes(int nodes) {
		this.nodes = nodes;
	}
}
