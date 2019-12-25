package graphs;

public class Graph {
	private Vertex[] vertexs;
	private Edges edges;
	
	public Graph(Vertex[] vertexs) {
		this.vertexs = vertexs.clone();
		this.edges = new Edges(this.vertexs);
	}
	
	public Vertex[] getVertexs() {
		return this.vertexs;
	}
	
	public Edges getEdges() {
		return this.edges;
	}
}
