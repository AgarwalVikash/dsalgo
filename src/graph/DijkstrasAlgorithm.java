package graph;

import java.util.PriorityQueue;

import graph.adjacencyListGraph.GraphNode;
import graph.adjacencyListGraph.Node;

public class DijkstrasAlgorithm {

	private PriorityQueue<Node> pq;
	private int[] dist;
	private int v;
	public DijkstrasAlgorithm(int v) {
		//we can use minIndexed priority queue to avoid duplicate node key.
		pq = new PriorityQueue<Node>(v, new Node());
		dist = new int[v];
		this.v = v;
	}

	public static void main(String args[]) {
		int v=9;
		GraphNode gn=new GraphNode(v);
		gn.addEdge(new Node(0,4,'0'), new Node(1,4,'1'));
		gn.addEdge(new Node(0,4,'0'), new Node(7,8,'7'));
		gn.addEdge(new Node(1,11,'1'), new Node(7,11,'7'));
		gn.addEdge(new Node(1,8,'1'), new Node(2,8,'2'));
		gn.addEdge(new Node(2,7,'2'), new Node(3,7,'3'));
		gn.addEdge(new Node(2,2,'2'), new Node(8,2,'8'));
		gn.addEdge(new Node(2,4,'2'), new Node(5,4,'5'));
		gn.addEdge(new Node(3,9,'3'), new Node(4,9,'4'));
		gn.addEdge(new Node(3,14,'3'), new Node(5,14,'5'));
		gn.addEdge(new Node(4,10,'4'), new Node(5,10,'5'));
		gn.addEdge(new Node(5,2,'5'), new Node(6,2,'6'));
		gn.addEdge(new Node(6,1,'6'), new Node(7,1,'7'));
		gn.addEdge(new Node(6,6,'6'), new Node(8,6,'8'));
		gn.addEdge(new Node(7,7,'7'), new Node(8,7,'8'));	
		DijkstrasAlgorithm dj=new DijkstrasAlgorithm(9);
		dj.dijkstrasAlgorithm(gn,0);
		for(int k:dj.dist) {
			System.out.println(k);
		}
	}

	private void dijkstrasAlgorithm(GraphNode gn,int src) {
		
		for(int i=0;i<v;i++) {
			dist[i]=Integer.MAX_VALUE;
		}
		int finalFlag=0;
		dist[src]=0;
		pq.add(new Node(src,0,'0'));
		while(!pq.isEmpty()) {
			//finalFlag=finalFlag+1;
			Node qn=pq.remove();
			if(qn.cost>dist[qn.node])
				continue;
			for(Node n:gn.getGraphList().get(qn.node)) {
				int newcost=qn.cost+n.cost;
				if(newcost<dist[n.node]) {
					dist[n.node]=newcost;
				}
				pq.add(new Node(n.node,newcost,n.label));
			}
		}
	}
}
