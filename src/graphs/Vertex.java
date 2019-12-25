package graphs;

import java.util.HashMap;

public class Vertex {
	private final String tag;
	private static HashMap<String, Vertex> vertexes = new HashMap<String, Vertex>();
	
	private Vertex(String tag) {
		this.tag = tag;
	}
	
	public static Vertex getVertex(String tag) {
		if (!(vertexes.containsKey(tag)))
			synchronized (Vertex.class) {
				if (!(vertexes.containsKey(tag)))
					vertexes.put(tag, new Vertex(tag));
			}
		return vertexes.get(tag);
	}
	
	public String getTag() {
		return this.tag;
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
