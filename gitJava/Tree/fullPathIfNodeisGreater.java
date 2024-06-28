import java.util.Stack;
import java.util.*;

public class fullPathIfNodeisGreater {

    static class Node{
        int data;
        Node left ;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx;
        public static Node buildTree(int nodes[]){
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


    public static void path(Node root, Stack<Integer> s, int k , int minval){
        if(root == null){
            return;
        }
        s.push(root.data);
        minval = Math.max(minval, root.data);

        if(root.left == null && root.right == null){
            if(minval >= k){
                System.out.print(s);
            }  
        }
        path(root.left, s,k,minval);
        path(root.right, s, k, minval);
        s.pop();
    }

    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(8);
        root.left.left = new Node(29);
        root.left.right = new Node(2);
        root.right.right = new Node(98);
        root.right.left = new Node(1);
        root.right.right.right = new Node(50);
        root.left.left.left = new Node(20);
        // print(root);
        Stack<Integer> s = new Stack<>();
        path(root,s , 25, Integer.MIN_VALUE);
    }
    
}
