package graphs;

import java.util.HashMap;
import java.util.HashSet;

public class Edges {
	private HashMap<Vertex, HashSet<Vertex>> edges = new HashMap<Vertex, HashSet<Vertex>>();
	
	public Edges() {}
	
	public boolean addEdge(Vertex out,Vertex in) {
		if (!(edges.containsKey(out)))
			synchronized (edges) {
				if (!(edges.containsKey(out)))
					edges.put(out, new HashSet<Vertex>());
			}
		synchronized (edges.get(out)) {
			return edges.get(out).add(in);	
		}
	}
	
	public boolean isEdge(Vertex out,Vertex in) {
		synchronized (edges) {
			return edges.get(out).contains(in);
		}
	}
	
	public HashSet<Vertex> getAdjacentList(Vertex v){
		if (edges.get(v) == null)
			return new HashSet<Vertex>();
		synchronized (edges.get(v)) {
			return edges.get(v);
		}
	}

}
