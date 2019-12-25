package graphs;

public class Vertex {
	private final String tag;
	
	public Vertex(String tag) {
		this.tag = tag;
	}
	
	public Vertex() {
		this.tag = null;
	}
	
	public String getTag() {
		return this.tag;
	}
	
	public String toString() {
		return this.getTag();
	}
	
	public Object clone() {
		return new Vertex(this.getTag());
	}
	
	public boolean equals(Vertex other) {
		return this.getTag().equals(other.getTag());
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof Vertex))
			return false;
		return this.equals((Vertex) o);
	}
}
