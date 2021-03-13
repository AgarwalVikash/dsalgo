package graph.adjacencyListGraph;

import java.util.Comparator;

public class Node implements Comparator<Node> {
	public int node;
	public int cost;
	public char label;

	public Node() {
	}

	public Node(int node, int cost, char label) {
		this.node = node;
		this.cost = cost;
		this.label = label;
	}

	@Override
	public int compare(Node n1, Node n2) {
		// TODO Auto-generated method stub
		if (n1.cost < n2.cost)
			return -1;
		if (n1.cost > n2.cost)
			return 1;
		return 0;
	}
}
