package graphs;

public class Vertex {
	private String tag;
	
	public Vertex(String tag) {
		this.tag = tag;
	}
	
	public String getTag() {
		return this.tag;
	}
	
	public boolean setTag(String tag) {
		if (this.tag.equals(tag))
			return false;
		else
			this.tag = tag;
			return true;
	}
	
	public String toString() {
		return getTag();
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof Vertex))
			return false;
		return this.getTag().equals(((Vertex) o).getTag());
	}
}
