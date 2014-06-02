package Graph;

import java.util.ArrayList;

public class Graph<E, V> {
	/**
	 * Connected, directional, cyclic 
	 * 2d adjacency array for edges
	 */
	ArrayList vertices = new ArrayList();
	ArrayList<ArrayList> edges;
	public Graph(){
		edges =	new ArrayList<ArrayList>();
	}
	public void addVertex(V value){
		
	}
	private class Vertex{
		private Vertex(){
			
		}
	}
}
