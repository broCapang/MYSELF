package exercises.sem2.FinalExam.q6;

class Edge<T extends Comparable<T>, N extends Comparable <N>> {
	Vertex<T,N> toVertex;
	N distance;
        N speed;
	Edge<T,N> nextEdge;
	
	public Edge()	{
		toVertex = null;
		distance = null;
                speed = null;
		nextEdge = null;
	}
	
	public Edge(Vertex<T,N> destination, N w,N c, Edge<T,N> a)	{
		toVertex = destination;
		distance = w;
		speed = c;
		nextEdge = a;
	}

}
