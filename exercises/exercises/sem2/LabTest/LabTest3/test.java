package exercises.sem2.LabTest.LabTest3;

public class test {

    public static void main(String[] args) {
        String actors[] = {"Ben Whishaw","Jeffrey Wright","Joseph Mazzello","Nick Frost","Rami Malek","Robert Popper","Simon Pegg","Ving Rhames"};
        UnweightedGraph<String> graph = new UnweightedGraph<>();

        for (String i : actors){
            graph.addVertex(i);
        }

        graph.addEdge( "Ben Whishaw", "Jeffrey Wright" );
        graph.addEdge( "Ben Whishaw", "Rami Malek" );
        graph.addEdge( "Jeffrey Wright", "Rami Malek" );
        graph.addEdge( "Joseph Mazzello", "Rami Malek" );
        graph.addEdge( "Nick Frost", "Robert Popper" );
        graph.addEdge( "Nick Frost", "Simon Pegg" );
        graph.addEdge( "Simon Pegg", "Ving Rhames" );

        graph.printEdges(); // display graph

        System.out.println();
        System.out.println("Convert into Adjacent Graph");
        AdjMatrix adjMatrix = new AdjMatrix(8);
        adjMatrix.addVertex(actors);
        adjMatrix.addEdge(0,1);
        adjMatrix.addEdge(0,4);
        adjMatrix.addEdge(1,4);
        adjMatrix.addEdge(2,4);
        adjMatrix.addEdge(3,5);
        adjMatrix.addEdge(3,6);
        adjMatrix.addEdge(6,7);

        System.out.println(adjMatrix.toString());
        System.out.println("Begin Depth First Search;");
        for (String i : actors){
            graph.dfs(i); //depth first search function in UnweightedGraph
            System.out.println("next starting node...\n");
        }

    }


}
