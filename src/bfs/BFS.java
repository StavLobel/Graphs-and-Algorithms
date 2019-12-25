package bfs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import graphs.Graph;
import graphs.Vertex;

public class BFS {
	private HashMap<Vertex, BFS_Data> vertexes = new HashMap<Vertex, BFS_Data>();
	private Queue<Vertex> q = new LinkedList<Vertex>();
	
	public BFS(Graph g,Vertex s) {
		for (Vertex v : g.getVertexs())
			vertexes.put(v, new BFS_Data());
		initialize(s);
		BFS_Run(g);
	}
	
	private boolean initialize(Vertex s) {
		for (BFS_Data v : vertexes.values()) {
			v.d = Integer.MAX_VALUE;
			v.pie = null;
			v.color = "white";
		}
		BFS_Data source = vertexes.get(s);
		source.d = 0;
		source.pie = null;
		source.color = "gray";
		return q.add(s);
	}
	
	private boolean BFS_Run(Graph g) {
		while(!(q.isEmpty())) {
			Vertex u = q.remove();
			for (Vertex v : g.getEdges().getAdjacentList(u)) {
				BFS_Data vData = vertexes.get(v);
				if (vData.color.equals("white")) {
					vData.color = "gray";
					vData.d = vertexes.get(u).d+1;
					vData.pie = u;
					q.add(v);
				}
			}
			vertexes.get(u).color="black";
		}
		return true;
	}
}
