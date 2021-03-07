package graph.matrixGraph;

public class Graph {

	private final int MAX_VERTS = 20;
	private Vertex vertexList[];
	private int adjMat[][];
	private int number_of_vertex;


	public Graph() {
		vertexList = new Vertex[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		number_of_vertex = 0;
	}

	public Vertex[] getVertexList() {
		return vertexList;
	}

	public void setVertexList(Vertex[] vertexList) {
		this.vertexList = vertexList;
	}

	public int[][] getAdjMat() {
		return adjMat;
	}

	public void setAdjMat(int[][] adjMat) {
		this.adjMat = adjMat;
	}

	public int getNumber_of_vertex() {
		return number_of_vertex;
	}

	public void setNumber_of_vertex(int number_of_vertex) {
		this.number_of_vertex = number_of_vertex;
	}


	public int getMAX_VERTS() {
		return MAX_VERTS;
	}

	public void addVertex(char label) {
		vertexList[number_of_vertex++] = new Vertex(label, false);
	}

	public void addEdgeDirectional(int start, int end) {
		adjMat[start][end] = 1;
	}
	public void addNonDirectional(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}

	public void displayVertex(int v) {
		System.out.print(vertexList[v].getLabel());
	}

	public int getAdjUnvisitedVertex(int peek) {

		for (int i = 0; i < getNumber_of_vertex(); i++) {
			if(adjMat[peek][i]==1 && vertexList[i].isVisited()==false){
				return i;
			}
		}
		return -1;
	
	}
}
