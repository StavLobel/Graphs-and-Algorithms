package graphs;

public class Edge {
	private final Vertex out;
	private final Vertex in;

	public Edge(Vertex out, Vertex in) {
		this.out = out;
		this.in = in;
	}

	public Vertex getOut() {
		return this.out;
	}

	public Vertex getIn() {
		return this.in;
	}
	
	public String toString() {
		return "("+getOut()+","+getIn()+")";
	}

}
