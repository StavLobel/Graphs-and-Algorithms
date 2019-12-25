package graphs;

import java.util.HashMap;
import java.util.LinkedList;

public class AdjGraph implements GraphRep {
	private HashMap<Vertex, LinkedList<Vertex>> adj_list = new HashMap<Vertex, LinkedList<Vertex>>();
	
	public AdjGraph(Vertex[] vertexes) {
		for (int i = 0 ; i < vertexes.length ; ++i)
			adj_list.put(vertexes[i], new LinkedList<Vertex>());
	}
	
	public boolean setEdge(Edge e) {
		if (!(adj_list.get(e.getOut()).contains(e.getIn())))
			return adj_list.get(e.getOut()).add(e.getIn());
		return false;
	}
	
	public boolean hasEdge(Edge e) {
		return adj_list.get(e.getOut()).contains(e.getIn());
	}
	
	public String toString() {
		String s = "";
		
		for (Vertex u : adj_list.keySet()) {
			s += u.getTag();
			LinkedList<Vertex> list = adj_list.get(u);
			for (Vertex v : list)
				s += "->"+v;
			s += '\n';
		}
		return s;
	}
}
