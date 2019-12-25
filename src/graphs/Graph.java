package graphs;

public class Graph {
	private Vertex[] vertexs;
	private Edges edges;
	
	public Graph(Vertex[] vertexs,Edges edges) {
		this.vertexs = vertexs;
		this.edges = edges;
	}
	
	public Vertex[] getVertexs() {
		return this.vertexs;
	}
	
	public Edges getEdges() {
		return this.edges;
	}
}
