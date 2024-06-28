import java.util.*;

public class averageOfLevelsData {


    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;

        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void print(Node root){
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int count = q.size();
            int sum = 0;
            int c = 0;
            while(count -->0){
                c++;

                Node temp = q.poll();
                sum = sum + temp.data;
                
                arr.add(sum);
                if(temp.left!= null)
                q.add(temp.left);
                
                if(temp.right!= null)
                q.add(temp.right);
                System.out.println(sum/c);
            }
        }
       
    }

    public static void main(String args[]){
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,7,-1,-1,10,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        // System.out.print(root.data); 
        print(root);
    }
    
}
