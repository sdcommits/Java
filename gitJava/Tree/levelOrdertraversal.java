import java.util.*;

public class levelOrdertraversal {

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
            Node root = new Node(nodes[idx]);
            root.left = buildTree(nodes);
            root.right = buildTree(nodes);
            return root;
        }
    }


    public static void levelOrder(Node root){
        if(root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i =0;i<size;i++){
                Node temp = q.poll();
                System.out.println(temp.data + " ");

                if(temp.left != null){
                    q.offer(temp.left);
                }
                if(root.right != null){
                    q.offer(temp.right);
                }
            }
            System.out.println(" ");
        }
        


    }

    public static void main(String args[]){
        int node[] = {1, 2, 4, 8, -1, -1, 9, -1, -1, 8, -1, -1, 3, 6, 10, -1, -1, 11, -1, -1, 7, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);

        levelOrder(root);
    }
    
}


