package graphs;

import java.util.HashMap;
import java.util.LinkedList;

public class Edges {
	private HashMap<Vertex, LinkedList<Vertex>> edges = new HashMap<Vertex, LinkedList<Vertex>>();
	
	public Edges(Vertex[] vertexes) {
		for (Vertex v : vertexes)
			edges.put(v, new LinkedList<Vertex>());
	}
	
	public boolean addEdge(Vertex out,Vertex in) {
		if (isEdge(out,in))
			return false;
		return edges.get(out).add(in);
	}
	
	public boolean isEdge(Vertex out,Vertex in) {
		return edges.get(out).contains(in);
	}
	
	public LinkedList<Vertex> getAdjacentList(Vertex v){
		return edges.get(v);
	}

}
