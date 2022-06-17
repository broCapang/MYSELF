package exercises.sem2.Tutor.T11;

public class tutor {
    public static void main(String[] args) {
        String[] ver = {"A","B","C","D","E","F","G","H","I"};
        Graph<String, Integer> myGraph = new Graph<>();
        for (String i : ver){
            myGraph.addVertex(i);
        }
        myGraph.addEdge("A","C",0);
        myGraph.addEdge("A","D",0);
        myGraph.addEdge("C","E",0);
        myGraph.addEdge("C","F",0);
        myGraph.addEdge("D","E",0);

        myGraph.printEdges();


    }
}
