package bfs;

import graphs.Vertex;

class BFS_Data {
	public int d;
	public Vertex pie;
	public String color;
	
	public String toString() {
		if (d == Integer.MAX_VALUE)
			return "d : ∞ π : "+pie;
		return "d : " + d +" π : "+pie;
	}
}
