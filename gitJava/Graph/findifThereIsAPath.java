package Graph;
import java.util.*;

public class findifThereIsAPath {

    ArrayList<ArrayList<Integer>> graph;
    int V;

    findifThereIsAPath(int V){
        this.V = V;
        graph = new ArrayList<>();

        for(int i = 0;i<V;i++){
            graph.add( new ArrayList<>());
        }
    }

    void addEdge(int src, int dest){
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }

    boolean path(int v, boolean[] visit, int target){
        if(v == target) return true;
        visit[v] = true;
        for(int i : graph.get(v)){
            if(!visit[i]){
                if(path(i,visit, target)){
               
                    return true;}
            }
        }
        return false;
    }


    boolean out(int src, int dest) {
        boolean[] visit = new boolean[V];
        return path(src, visit, dest);
    }


    public static void main(String args[]){
        int V = 5;
        findifThereIsAPath g1 = new findifThereIsAPath(V);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 1);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        g1.addEdge(4, 1);
        if(g1.out(0,3)){
            System.out.println("Yes");
        }
        else{
            System.out.println("N0");
        }
    }    
}
