package Graph;
import java.util.*;

//so we have to find out if the graph have cycle or not,
  
public class undirectedGraph {

    ArrayList<ArrayList<Integer>> graph;
    int V;

    undirectedGraph(int V){
        this.V = V;
        graph = new ArrayList<>();
        for(int i = 0;i<V;i++){
            graph.add(i,new ArrayList<>());
        }   
    }
    void addEdge(int src, int dest){
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }
    boolean isCycle(int v, boolean[] visit, int parent){
        visit[v] = true;
        for(int i : graph.get(v)){
            if(!visit[v]){
                if(isCycle(i, visit, v)){
                    return true;
                }
            }
            else if(i != parent){
                return true;
            }
        }
        return false;
    }
    boolean out(){
        boolean[] visit = new boolean[V];
        for(int i =0;i<V;i++){
            if(!visit[i]){
                if(isCycle(i, visit, -1)) return  true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int V = 5;
        undirectedGraph g1 = new undirectedGraph(V);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 1);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        g1.addEdge(4, 1);

        if(g1.out()){
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");
        }

    }   
}


