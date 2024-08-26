import java.util.ArrayList;

public class transitiveClosureOfGraph {

    private int vertices;
    private ArrayList<Integer>[] adjList;
    private int[][] tc;

    public void addEdge(int u, int v){
        adjList[u].add(v);
    }

    public transitiveClosureOfGraph(int vertices){
        this.vertices = vertices;
        this.tc = new int[vertices][vertices];
        initAdjList();
    }

    private void initAdjList(){
        adjList = new ArrayList[vertices];
        for(int i = 0; i < vertices; i++){
            adjList[i] = new ArrayList<>();
        }
    }

    public void Tc(){
        for(int i =0;i<vertices;i++){
            boolean[] visit = new boolean[vertices];
            dfs(i,i,visit);
        }
    }

    public void dfs(int s , int c , boolean[] visit){
        visit[c] = true;
        tc[s][c] = 1;
        for(int x : adjList[c]){
            if(!visit[x]){
                dfs(s,x,visit);
            }
        }
    }
    public static void main(String args[]){
        int vertices = 4;
        transitiveClosureOfGraph graph = new transitiveClosureOfGraph(vertices);
        
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        graph.Tc();
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(graph.tc[i][j] + " ");
            }
            System.out.println();
        }    
    }
}

