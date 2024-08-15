import java.util.*;

public class printingTheAdjLists {
    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    int V;

    printingTheAdjLists(int V){
        this.V= V;
        graph = new ArrayList<>();
        for(int i =0;i<V;i++){
            graph.add(new ArrayList<>());
        }  
    }

    void addEdge(int src , int dest){
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }

    void printList(){
        for(int i =0;i<V;i++){
            System.out.print("For: " + i+" ");
            for(int j =0;j<graph.get(i).size();j++){
                System.out.print(graph.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    



    public static void main(String args[]){
        printingTheAdjLists g = new printingTheAdjLists(9);
        g.addEdge(0, 1);
        g.addEdge(0, 7);
        g.addEdge(1, 2);
        g.addEdge(1, 7);
        g.addEdge(2, 3);
        g.addEdge(2, 8);
        g.addEdge(2, 5);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);
        g.addEdge(5, 6);
        g.addEdge(6, 7);
        g.addEdge(6, 8);
        g.addEdge(7, 8);

        // boolean[] visit = new boolean[9];

        g.printList();

    }   
}

