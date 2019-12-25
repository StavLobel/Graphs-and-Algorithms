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
	
	public String getOutString() {
		return this.out.toString();
	}
	
	public String getInString() {
		return this.in.toString();
	}
	
	public String toString() {
		return "("+this.getOutString()+","+this.getInString()+")";
	}

}
