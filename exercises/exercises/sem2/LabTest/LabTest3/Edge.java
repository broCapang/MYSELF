package exercises.sem2.LabTest.LabTest3;

class Edge<T extends Comparable<T>> {
	Vertex<T> toVertex;

	Edge<T> nextEdge;
	
	public Edge()	{
		toVertex = null;
		nextEdge = null;
	}
	
	public Edge(Vertex<T> destination, Edge<T> a)	{
		toVertex = destination;
		nextEdge = a;
	}

}
