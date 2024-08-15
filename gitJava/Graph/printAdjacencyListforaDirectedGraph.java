package Graph;
import java.util.*;

public class printAdjacencyListforaDirectedGraph {

    static void addEdge(Vector<Integer> adj[], int u, int v){
        adj[u].add(v);
    }

    static void initGraph(int V, int edges[][], int noOfNodes){
        Vector<Integer> adj[] = new Vector[3];
        for(int i =0;i<V;i++){
            adj[i] = new Vector<>();
        }
        for(int i =0;i<noOfNodes;i++){
            addEdge(adj, edges[i][0], edges[i][1]);
        }
        printList(adj, V);
    }
    static void printList(Vector<Integer> adj[], int V){
        for(int i =0;i<V;i++){
            System.out.print(i + "-> " );
            for(int x : adj[i]){
                System.out.print(x);
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[]){
        int V = 3;
        int edges[][] = { { 0, 1 }, { 1, 2 }, { 2, 0 } };
        int noOfNode = 3;

        initGraph(V, edges, noOfNode);


    }

    
}
