package exercises.sem2.LabTest.LabTest3;

public class AdjMatrix {
    private boolean adjMatrix[][];
    private int numVertices;
    private String vertex[];

    // Initialize the matrix
    public AdjMatrix(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
        vertex = new String [numVertices];
    }

    //Add Vertices

    public void addVertex(String[] s){
        for (int i=0;i<s.length;i++){
            vertex[i]=s[i];
        }
    }

    // Add edges
    public void addEdge(int i, int j) {
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }

    // Remove edges
    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }

    // Print the matrix
    public String toString() {
        String s = new String();
        for (int i = 0; i < numVertices; i++) {
            s+=(vertex[i] + "\t: "); //print vertices
            for (boolean j : adjMatrix[i]) {
                s+=((j ? 1 : 0) + " ");
            }
            s+=("\n");
        }
        return s;
    }
}
