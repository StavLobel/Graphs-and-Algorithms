package graphs;

public class MatrixGraph {
	private boolean[][] edges;
	private Object[][] graph;
	
	public MatrixGraph(Vertex[] vertexes) {
		graph = new Object[vertexes.length][vertexes.length];
		for (int i = 0 ; i < vertexes.length ; ++i)
			graph[i][0] = vertexes[i].clone();
	}
	
	public String toString() {
		Object[] g
	}
}
