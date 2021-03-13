package graph.adjacencyListGraph;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
	private List<List<Node>> graphList;
	private int nodes;
	private boolean visited[];

	public List<List<Node>> getGraphList() {
		return graphList;
	}

	public void setGraphList(List<List<Node>> graphList) {
		this.graphList = graphList;
	}

	public boolean[] getVisited() {
		return visited;
	}

	public void setVisited(boolean[] visited) {
		this.visited = visited;
	}

	public GraphNode(int nodes) {
		graphList = new ArrayList<>();
		visited=new boolean[nodes];
		this.setNodes(nodes);
		for (int i = 0; i < nodes; i++) {
			graphList.add(i, new ArrayList<Node>());
		}
	}

	public void addEdge(Node a, Node b) {
		graphList.get(a.node).add(b);
		graphList.get(b.node).add(a);
	}

	public int getNodes() {
		return nodes;
	}

	public void setNodes(int nodes) {
		this.nodes = nodes;
	}
}
