package exercises.sem2.Tutor.T11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class training {
    static Graph<Character,Integer> bro = new Graph<>();

    public static void main(String[] args) {

        Character [] vertex = {'A','B','C','D','E','F','G'};
        for (Character i : vertex){
            bro.addVertex(i);
        }

        bro.addEdge('A','B',1);
        bro.addEdge('A','C',1);
        bro.addEdge('B','D',1);
        bro.addEdge('B','E',1);
        bro.addEdge('C','F',1);

        bro.printEdges();
        System.out.println("The path is : " + shortestPath('A','E'));

    }

    static Set<Character> visited = new HashSet<>();

    // DFS for the path
    public static boolean shortestPath(Character source, Character destination){

        ArrayList<Character> neighbourVertex = bro.getNeighbours(source);

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

        for(Character neighbour : neighbourVertex){
            if(shortestPath(neighbour,destination)){
                visited.clear();
                return true;
            }
        }
        return false;
    }


}
