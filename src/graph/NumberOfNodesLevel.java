package graph;

import java.util.LinkedList;
import java.util.Queue;

import graph.adjacencyListGraph.Graph;

public class NumberOfNodesLevel {
	public static void main(String args[]) {
		Graph g = new Graph(7);
		int l = 2;
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(1, 5);
		g.addEdge(2, 6);
		System.out.println(getNumberOfNodesLevel(l, g));
	}

	private static int getNumberOfNodesLevel(int l, Graph g) {
		Queue<Integer> q = new LinkedList<Integer>();
		int s = 0;
		g.getVisited()[0] = true;
		q.offer(0);
		int count=0;
		int[] level=new int[7];
		level[s]=0;
		while (!q.isEmpty()) {
			s = q.peek();
			q.poll();
			for (int i : g.getGraphList().get(s)) {
				if (!g.getVisited()[i]) {
					g.getVisited()[i] = true;
					q.offer(i);
					level[i]=level[s]+1;
				}
			}
			for(int i=0;i<7;i++) {
				if(level[i]==l) {
					count++;
				}
			}
			if(count>=1) {
				break;
			}
		}
		return count;
	}
}
