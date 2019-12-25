package graphs;

public class Vertex implements Cloneable{
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
	
}
