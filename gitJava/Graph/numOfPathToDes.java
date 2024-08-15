// Return the number of ways you can arrive at your
//  destination in the shortest amount of time.

import java.util.*;

public class numOfPathToDes {

    ArrayList<ArrayList<Integer>> graph;
    int V;

    numOfPathToDes(int V){
        this.V = V;
        graph = new ArrayList<>();

        for(int i =0;i<V;i++){
            graph.add(new ArrayList<>());
        }
    }

    void addEdge(int src , int des){
        graph.get(src).add(des);
        graph.get(des).add(src);
    }


    int numOfPath(int n , int m, boolean[] visit, List<Integer> path){

        visit[n] = true;
        int c = 0;
        path.add(n);
        if(n == m){
            System.out.println(path);
            c = 1;
        }

        else{
            for(int k : graph.get(n)){
               if(!visit[k]){
                c += numOfPath(k,m,visit,path);
               }
            }
        }
        visit[n] = false;
        path.remove(path.size()-1);
        return c;
    }

    public static void main(String args[]){
        numOfPathToDes g = new numOfPathToDes(8);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(4, 1);
        g.addEdge(4, 5);
        g.addEdge(5, 3);
        g.addEdge(4, 2);
        g.addEdge(3, 2);
        g.addEdge(1, 5);
        boolean[] visit = new boolean[8];
        List<Integer> path = new ArrayList<>();
        // int c = 0;
        int c = g.numOfPath(1,3,visit, path);

        System.out.println(c);



    }  
}
