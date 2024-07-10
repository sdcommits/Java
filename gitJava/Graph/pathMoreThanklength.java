import java.util.*;

public class pathMoreThanklength {

    class WeightedGraph {
        int dest;
        int wt;

        public WeightedGraph(int dest, int wt) {
            this.dest = dest;
            this.wt = wt;
        }
    }

    ArrayList<ArrayList<WeightedGraph>> graph = new ArrayList<>();
    int V;

    pathMoreThanklength(int V) {
        this.V = V;

        graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
    }

    void addEdge(int src, int dest, int wt) {
        graph.get(src).add(new WeightedGraph(dest, wt));
        graph.get(dest).add(new WeightedGraph(src, wt));
    }

    boolean check(int src, int k, boolean[] visit, int len ){
        if(len >= k) return true;

        visit[src] = true;

        for(WeightedGraph edge : graph.get(src)){
            if(!visit[edge.dest]){
                if (check(edge.dest, k, visit, len + edge.wt)) {
                    return true;
                }
            }
        }

        visit[src] = false;

        return false;

    }

    public static void main(String args[]) {

        pathMoreThanklength g = new pathMoreThanklength(9);
        g.addEdge(0, 1, 4);
        g.addEdge(0, 7, 8);
        g.addEdge(1, 2, 8);
        g.addEdge(1, 7, 11);
        g.addEdge(2, 3, 7);
        g.addEdge(2, 8, 2);
        g.addEdge(2, 5, 4);
        g.addEdge(3, 4, 9);
        g.addEdge(3, 5, 14);
        g.addEdge(4, 5, 10);
        g.addEdge(5, 6, 2);
        g.addEdge(6, 7, 1);
        g.addEdge(6, 8, 6);
        g.addEdge(7, 8, 7);

        int source = 0; 
        int k = 62;   


        boolean[] visited = new boolean[g.V];
        boolean pathExists = g.check(source, k, visited, 0);

        if (pathExists) {
            System.out.println("There exists a path from source " + source + " with length >= " + k);
        } else {
            System.out.println("No path from source " + source + " with length >= " + k + " exists.");
        }
    }

}

