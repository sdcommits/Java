import java.util.*;

public class notPrintingRightMost {

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

        q.add(root);
        while(!q.isEmpty()){
            int count = q.size();
            while(count-->0){

                Node temp = q.poll();
                if(count>=1){
                    System.out.println(temp.data);
                }

                if(temp.left!= null )
                    q.add(temp.left);

                if(temp.right!= null)
                    q.add(temp.right);

                }
            }
        }
    public static void main(String args[]){
        // int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,7,-1,-1,8,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        // System.out.print(root.data); 
        print(root);
    }
    
}
