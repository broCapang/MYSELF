package exercises.sem2.Tutor.T11;

public class Vertices <T extends Comparable<T>, N extends Comparable<N>> {
    T vertexInfo;
    int indeg;
    int outdeg;
    Vertices<T,N> nextVertex;
    Edge<T,N> firstEdge;

    public Vertices() {
        vertexInfo=null;
        indeg=0;
        outdeg=0;
        nextVertex=null;
        firstEdge=null;
    }

    public Vertices(T vertexInfo,Vertices<T,N> nextVertex){
        this.vertexInfo = vertexInfo;
        this.indeg=0;
        this.outdeg=0;
        this.nextVertex = nextVertex;
        firstEdge = null;
    }
}
