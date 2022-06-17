package exercises.sem2.Tutor.T11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class training_2 {
    static Graph<String, Double> weightedGraph = new Graph<>();

    public static void main(String[] args) {

        String[] vertices = {"A", "B", "C", "D", "E", "F", "G", "H"};

        for (String vertex : vertices) {
            weightedGraph.addVertex(vertex);
        }

        System.out.println("Creating a graph with " + vertices.length + " vertices and 10 edges");
        weightedGraph.addEdge("A", "B", 0.4);
        weightedGraph.addEdge("A", "C", 0.7);
        weightedGraph.addEdge("A", "G", 0.9);

        weightedGraph.addEdge("B", "C", 0.4);
        weightedGraph.addEdge("B", "D", 0.2);
        weightedGraph.addEdge("B", "E", 0.7);

        weightedGraph.addEdge("C", "F", 0.3);

        weightedGraph.addEdge("E","H",0.5);

        weightedGraph.addEdge("F","H",0.4);

        weightedGraph.addEdge("G","H",0.8);

        for(Vertex vertex : weightedGraph.getAllVertices()){
            System.out.println(vertex.vertexInfo + " --> ");
            weightedGraph.getNeighbours((String) vertex.vertexInfo);
            System.out.println();
        }

        System.out.println("The shortest path from A - H by distance");
        shortestPath("A","H");

        System.out.println("The shortest path from A - H by cost ");
        System.out.println(getPathWithMinimumWeight("A","H"));;
    }

    // DFS for the path
    static Set<String> visited = new HashSet<>();
    public static boolean shortestPath(String source, String destination){

        ArrayList<String> neighbourVertex = weightedGraph.getNeighbours(source);

        if(visited.contains(source)||neighbourVertex==null){
            return false;
        }

        if(source.equals(destination)){
            System.out.println(source);
            visited.clear();
            return true;
        }

        visited.add(source);
        System.out.print(source + " -> ");

        for(String neighbour : neighbourVertex){
            if(shortestPath(neighbour,destination)){
                visited.clear();
                return true;
            }
        }
        return false;
    }

    public static boolean getPathWithMinimumWeight(String source, String destination){

        if(source.equals(destination)){
            visited.clear();
            System.out.println(source);
            return true;
        }

        PriorityQueue<Edge<String,Double>> minimumEdge = new PriorityQueue<>();

        Edge<String, Double> edges = weightedGraph.getVertex(source).firstEdge;

        while (edges!=null){
            minimumEdge.offer(edges);
            edges = edges.nextEdge;
        }

        System.out.print(source + " -> " );
        visited.add(source);

        while (weightedGraph.getSize()!=0){
            Edge<String, Double> edge = minimumEdge.poll();
            // System.out.println("Polled" + edge.toVertex.vertexInfo);
            if(edge==null){
                return false;
            }
            if(getPathWithMinimumWeight(edge.toVertex.vertexInfo,destination)){
                return true;
            }
        }

        return false;
    }
}
