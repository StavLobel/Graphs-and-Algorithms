package graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixGraph implements GraphRep {
	private ArrayList<Vertex> vertexes;
	private boolean[][] matrix;
	
	public MatrixGraph(Vertex[] vertexs) {
		this.vertexes = new ArrayList<Vertex>(Arrays.asList(vertexs));
		this.matrix = new boolean[vertexs.length][vertexs.length];
	}
	
	public boolean setEdge(Edge e) {
		int i = vertexes.indexOf(e.getOut());
		int j = vertexes.indexOf(e.getIn());
		return this.matrix[i][j] = true;
	}
	
	public boolean setEdge(Vertex u,Vertex v) {
		return setEdge(new Edge(u, v));
	}
	
	public boolean hasEdge(Edge e) {
		int i = vertexes.indexOf(e.getOut());
		int j = vertexes.indexOf(e.getIn());
		return this.matrix[i][j];
	}
	
	public String[][] getMatrix(){
		String[][] s_matrix = new String[matrix.length+1][matrix.length+1];
		s_matrix[0][0] = " ";
		
		for (int i = 1 ; i < s_matrix.length ; ++i) {
			s_matrix[i][0] = vertexes.get(i-1).toString();
			s_matrix[0][i] = vertexes.get(i-1).toString();
		}
		
		for (int i = 1 ; i < s_matrix.length ; ++i)
			for (int j = 1 ; j < s_matrix.length ; ++j)
				s_matrix[i][j] = "" + matrix[i-1][j-1];
		return s_matrix;
	}
	
	public String toString() {
		return Arrays.deepToString(getMatrix());
	}
}