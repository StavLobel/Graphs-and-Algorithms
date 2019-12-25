package bfs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import graphs.Graph;
import graphs.Vertex;

public class BFS {
	private HashMap<Vertex, BFS_Data> vertexes = new HashMap<Vertex, BFS_Data>();
	private Queue<Vertex> q = new LinkedList<Vertex>();
	private Vertex[] vertexesList;
	
	public BFS(Graph g,Vertex s) {
		for (Vertex v : g.getVertexs())
			vertexes.put(v, new BFS_Data());
		vertexesList = g.getVertexs();
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
		q.add(s);
		return true;
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
	
	public String[][] createTable() {
		String[][] table = new String[3][vertexesList.length+1];
		table[0][0] = " ";
		table[1][0] = "d";
		table[2][0] = "π";
		
		for (int i = 0 ; i < vertexesList.length ; ++i) {
			table[0][i+1] = vertexesList[i].toString();
			if (vertexes.get(vertexesList[i]).d != Integer.MAX_VALUE)
				table[1][i+1] = vertexes.get(vertexesList[i]).d+"";
			else
				table[1][i+1] = "∞";
			if (vertexes.get(vertexesList[i]).pie != null)
				table[2][i+1] = vertexes.get(vertexesList[i]).pie.toString()+"";
			else
				table[2][i+1] = " ";
		}
		return table;
	}
	
	public String toString() {
		String[][] table = createTable();
		String s = "";
		for (int i = 0 ; i < table.length ; ++i) {
			for (int j = 0 ; j < table[i].length ; ++j)
				s += table[i][j] + " ";
			s += '\n';
		}
		return s;
	}
	
}
