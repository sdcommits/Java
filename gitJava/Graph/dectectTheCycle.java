import java.util.*;

public class dectectTheCycle {

    ArrayList<ArrayList<Integer>> graph;
    int V;
 
    dectectTheCycle(int V){
        this.V = V;
        graph = new ArrayList<>();
        
        for(int i =0;i<V;i++){
            graph.add(new ArrayList<>());
        }
    }
    
    public void addEdge(int src, int des){
        graph.get(src).add(des);
        graph.get(des).add(src);
    }

    boolean detectCycle(){

        boolean[] visit = new boolean[V];
        Arrays.fill(visit, false);
        for(int i =0;i<V;i++){
            if(!visit[i]){
                if(check(i,-1,visit)){
                    return true;
                }
            }
        }
        return false;
    }

    boolean check(int src , int des, boolean[] visit){
        visit[src] = true;

        for(int x : graph.get(src)){
            if(!visit[x]){
                if(check(x, src , visit)){
                    return true;
                }
            }
            else if(x != des){
                return true;
            }
        }
        return false;

        

    }

    public static void main(String[] args) {
        dectectTheCycle g = new dectectTheCycle(4);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(0, 2);

        if(g.detectCycle()){
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");
        }

        
    }   
}
