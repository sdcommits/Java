package Graph;
import java.util.*;

public class connectedComponents {
    int V;
    ArrayList<ArrayList<Integer>>  adjListArray;

    connectedComponents (int V){
        this.V = V;
        adjListArray = new ArrayList<>();
        for(int i =0;i<V;i++){
            adjListArray.add(i, new ArrayList());
        }
    }

    void dfsCheck(int v, boolean[] visit){
        visit[v] = true;
        System.out.print(v + " ");
        for(int x : adjListArray.get(v)){
            if(!visit[x]){
                dfsCheck(x,visit);
            }
        } 
    }

    void connections(){
        boolean[] visit  = new boolean[V];
        for(int i =0;i<V;i++){
            if(!visit[i]){
                dfsCheck(i, visit);
                System.out.println();
            }
        }

    }

    void addEdge(int src, int dest){
        adjListArray.get(src).add(dest);
        adjListArray.get(dest).add(src);
    }

    public static void main(String args[]){
        int V = 5;
        connectedComponents g = new connectedComponents(V);
        g.addEdge(1,0);
        g.addEdge(2,1);
        g.addEdge(3,4);

        g.connections();


    }
    
}
