import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
class Edge {
    int src;     // source vertex
    int nbr;     // neighbour
    int wt;      // weight

    public Edge(int src, int nbr, int wt) {
        this.nbr = nbr;
        this.src = src;
        this.wt = wt;
    }

    public Edge() {
    }

}

public class ShortestPath {

    public static void displayArr(int[] arr){
        for (int i = 0;i<arr.length;i++) 
        System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void bellManFordAlgo(ArrayList<Edge>[] graph, int src) {

        int[] dist = new int[graph.length];
        int[] predecessors = new int[graph.length];

        Arrays.fill(predecessors,-1);

        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;

        System.out.println("Shortest Path Estimate after initialization: ");
        displayArr(dist);
        System.out.println("\nPredecessors after initialization: ");
        displayArr(predecessors);

        // Relaxation for V - 1 Times
        for (int i = 0; i < graph.length - 1; i++) {
            for (int j = 0; j < graph.length; j++) {
                for (Edge e: graph[j]) {
                    int u = e.src;
                    int v = e.nbr;
                    int weight = e.wt;
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                        dist[v] = dist[u] + weight;
                        predecessors[v] = u;
                    }
                }
            }
        }

        // Check for negative wt cycles
        for (int j = 0; j < graph.length; ++j) {
            for (Edge e: graph[j]) {
                int u = e.src;
                int v = e.nbr;
                int weight = e.wt;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    System.out.println("Graph contains negative weight cycle");
                    return;
                }
            }
        }

        System.out.println("\nShortest Path Estimates:  ");
        displayArr(dist);

        System.out.println("\nPredecessors: ");
        displayArr(predecessors);

        System.out.println("\nPaths: ");
        for (int i = 0;i<graph.length;i++) {
            System.out.print(src+" -> ");
            printPath(predecessors, i);
        }

    }

    public static void printPath(int[] predecessor,int i){
        if(predecessor[i] == -1) {
            System.out.println();
            return;
        }
        System.out.print(i+" -> ");
        printPath(predecessor,predecessor[i]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of Vertex: ");
        int n = sc.nextInt();
        ArrayList<Edge>[] graph = new ArrayList[n];

        for (int i = 0; i < graph.length; i++) graph[i] = new ArrayList<>();

        System.out.println("Enter the edges ");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number of edges at " + i + "th Vertex:  ");
            int nbrs = sc.nextInt();
            for (int j = 0; j < nbrs; j++) {
                System.out.print("nbr,wt: ");
                int nbr = sc.nextInt();
                int wt = sc.nextInt();
                graph[i].add(new Edge(i, nbr, wt));
                System.out.println();
            }
        }

        System.out.println("\nEdge Table: ");
        for (int i = 0;i<graph.length;i++){
            for (Edge e: graph[i]){
                System.out.println(e.src+" ---> "+e.nbr+" : "+e.wt);
            }
        }

        System.out.print("Enter Source: ");
        int src = sc.nextInt();

        bellManFordAlgo(graph,src);


    }

}