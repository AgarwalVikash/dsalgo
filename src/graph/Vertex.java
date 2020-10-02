package graph;

public class Vertex {
	
	private char label;
	private boolean isVisited;
	
	public Vertex(char label,boolean isVisited) {
		this.setLabel(label);
		this.setVisited(isVisited);
	}

	public char getLabel() {
		return label;
	}

	public void setLabel(char label) {
		this.label = label;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
	
}
