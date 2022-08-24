package exercises.sem2.FinalExam.q6;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.*;

public class Tester {
    
    static WeightedGraph<String,Double> myCity = new WeightedGraph<>(); 

    public static void main(String[] args) {
        String[] vertexs = {"A","B","C","D","E","F","G"};
        for (String vertex : vertexs) {
            myCity.addVertex(vertex);
        }
        // add edges
        myCity.addEdge("A", "B",7.0,1.0);
        myCity.addEdge("A", "C",10.1,1.0);
        myCity.addEdge("B", "A",7.0,1.0);
        myCity.addEdge("B", "C",5.5,1.0);
        myCity.addEdge("C", "B",5.5,1.0);
        myCity.addEdge("C", "D",8.3,1.25);
        myCity.addEdge("B", "E",3.2,1.25);
        myCity.addEdge("E", "D",2.9,1.25);
        myCity.addEdge("D", "G",4.9,1.5);
        myCity.addEdge("E", "G",6.0,1.5);
        myCity.addEdge("G", "E",6.0,1.5);
        myCity.addEdge("E", "F",4.0,1.5);
        myCity.addEdge("F", "G",2.3,1.2);

        System.out.println("The number of vertices in MyCityGraph: " + myCity.getSize());
        System.out.println("List all vertices: ");
        System.out.println(myCity.getAllVertexObjects());
        System.out.println("Has edge from B to A? "+myCity.hasEdge("A", "B"));
        System.out.println("Has edge from A to D? "+myCity.hasEdge("A", "D"));
        System.out.println("Find all neighbours of B : "+myCity.getNeighbours("B"));
        myCity.printEdges();
        // QUESTION 6 (B)
        System.out.println("QUESTION 6 (B)");
        System.out.println("1: A -> B -> E -> G");
        System.out.println("2: A -> B -> E -> D -> G");
        System.out.println("3: A -> B -> E -> F -> G");
        System.out.println("4: A -> B -> C -> D -> G");
        System.out.println("5: A -> C -> D -> G");

        String[] path1 = {"A","B","E","G"};
        
        Double[] distance = new Double[5];
        Double[] duration = new Double[5];
        int[] paths = {1,2,3,4,5};
                int[] paths2 = {1,2,3,4,5};

        System.out.print("Path 1: ");
        for (String vertex : path1) {
            System.out.print(vertex + "->");
        }
        System.out.println("");
        System.out.println("Distance = "+calculateDistance(path1)+"km, Duration = "+calculateDuration(path1)+"min");
        distance[0] = calculateDistance(path1);
        duration[0] = calculateDuration(path1);
        
        String[] path2 = {"A","B","E","D","G"};
        
        System.out.print("Path 2: ");
        for (String vertex : path2) {
            System.out.print(vertex + "->");
        }
        System.out.println("");
        System.out.println("Distance = "+calculateDistance(path2)+"km, Duration = "+calculateDuration(path2)+"min");
        distance[1] = calculateDistance(path2);
        duration[1] = calculateDuration(path2);
        String[] path3 = {"A","B","E","F","G"};
        
        System.out.print("Path 3: ");
        for (String vertex : path3) {
            System.out.print(vertex + "->");
        }
        System.out.println("");
        System.out.println("Distance = "+calculateDistance(path3)+"km, Duration = "+calculateDuration(path3)+"min");
        distance[2] = calculateDistance(path3);
        duration[2] = calculateDuration(path3);
        String[] path4 = {"A","B","C","D","G"};
        
        System.out.print("Path 4: ");
        for (String vertex : path4) {
            System.out.print(vertex + "->");
        }
        System.out.println("");
        System.out.println("Distance = "+calculateDistance(path4)+"km, Duration = "+calculateDuration(path4)+"min");
        distance[3] = calculateDistance(path4);
        duration[3] = calculateDuration(path4);
        String[] path5 = {"A","C","D","G"};
        
        System.out.print("Path 5: ");
        for (String vertex : path5) {
            System.out.print(vertex + "->");
        }
        System.out.println("");
        System.out.println("Distance = "+calculateDistance(path5)+"km, Duration = "+calculateDuration(path5)+"min");
        
        distance[4] = calculateDistance(path5);
        duration[4] = calculateDuration(path5);
        
        System.out.println("After Bubble Sort:");
        sortDistance(distance,paths);
        for(int i = 0;i<5;i++){
            System.out.println("Path "+paths[i]+": ("+distance[i]+")");
        }
        
        
        System.out.println("");
        System.out.println("After Insertion Sort:");
        sortDuration(duration,paths2);
        for(int i = 0;i<5;i++){
            System.out.println("Path "+paths2[i]+": ("+duration[i]+")");
        }
    }

    public static double calculateDistance(String[] path){
        double distance = 0;
        for(int i = 0;i < path.length-1;i++){
            distance += myCity.getEdgeDistance(path[i],path[i+1]);
        }
        return distance;
    }
    
    public static double calculateDuration(String[] path){
        double duration = 0;
        for(int i = 0;i < path.length-1;i++){
            duration += myCity.getEdgeDistance(path[i],path[i+1])*myCity.getEdgeSpeed(path[i],path[i+1]);
        }
        return duration*2;
    }
    
    public static void sortDistance(Double arr[], int[] path){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    double temp = arr[j];
                    int temp2 = path[j];
                    arr[j] = arr[j + 1];
                    path[j] = path[j+1];
                    arr[j + 1] = temp;
                    path[j+1] = temp2;
                }
    }
    
    public static void sortDuration(Double [] arr, int[] path){
         int n = arr.length;
        for (int i = 1; i < n; ++i) {
            double key = arr[i];
            int j = i - 1;

            while (j >= 0 && key > arr[j]) {
                arr[j + 1] = arr[j];
                int temp = path[j+1];
                path[j + 1] = path[j];
                path[j] = temp;
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
