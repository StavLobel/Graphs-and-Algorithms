package Tests;

import bfs.BFS;
import graphs.Edges;
import graphs.Graph;
import graphs.Vertex;

public class Test {
	public static void main(String[] args) {
		Vertex a = Vertex.getVertex("a");
		Vertex b = Vertex.getVertex("b");
		Vertex c = Vertex.getVertex("c");
		Vertex d = Vertex.getVertex("d");
		
		Edges edges = new Edges();
		edges.addEdge(a, b);
		edges.addEdge(b, c);
		edges.addEdge(c, a);
		edges.addEdge(d, a);
		edges.addEdge(a, b);
		
		Vertex[] vs = {a,b,c,d};
		
		Graph g = new Graph(vs, edges);
		
		BFS bfs = new BFS(g, a);
		System.out.println(bfs);
	}
}
