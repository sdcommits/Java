import java.util.*;

public class allPossiblepath {

    ArrayList<ArrayList<Integer>> graph;
    int V;

    allPossiblepath(int V) {
        this.V = V;

        graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
    }

    void addEdge(int src, int dest) {
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }

    int outCount(int src, int dest) {
        boolean[] visited = new boolean[V];
        int[] pathCount = {0};
        dfs(src, dest, visited, pathCount);
        return pathCount[0];
    }

    void dfs(int v, int dest, boolean[] visited, int[] pathCount) {
        visited[v] = true;

        if (v == dest)
            pathCount[0]++;
        else {
            for (int i : graph.get(v)) {
                if (!visited[i]) {
                    dfs(i, dest, visited, pathCount);
                }
            }
        }

        visited[v] = false; // Backtrack
    }

    public static void main(String args[]) {
        int V = 5;
        allPossiblepath g1 = new allPossiblepath(V);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 1);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        g1.addEdge(4, 1);

        int src = 1;
        int dest = 4;
        int paths = g1.outCount(src, dest);
        System.out.println("Number of paths between " + src + " and " + dest + ": " + paths);
    }
}
