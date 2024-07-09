import java.util.*;

public class getLevelOfNode {

    static class Node{
        Node left;
        Node right;
        int data;

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

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);

        return Math.max(l,r)+1;  
    } 

    public static void out(Node root, int height){
        if(root == null) return;
        System.out.println(root.data + " prsents at " + height);

        out(root.left, height+1);
        out(root.right, height+2);
    }

    public static void main(String args[]){
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        System.out.println(root.data); 
        int h = 1;
        out(root, h);
    }  
}
