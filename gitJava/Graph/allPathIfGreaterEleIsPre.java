package Graph;
import java.util.*;

public class allPathIfGreaterEleIsPre {

    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    static class BinaryTree{
        static int idx = -1;
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

    public static void print(Node root){
        if(root == null){
            return;
        }
        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
    }


    // public static void path(Node root , Stack<Integer> s,int k){
    //     if(root == null){
    //         return;
    //     }
    //     s.push(root.data);
    //     if (root.left == null && root.right == null) {
    //         boolean validPath = true;
    //         for (int value : s) {
    //             if (value <= k) {
    //                 validPath = false;
    //                 break;
    //             }
    //         }

    //         if (validPath) {
    //             System.out.println(s);
    //         }
    //     }
    //     path(root.left, s,k);
    //     path(root.right, s,k);
    //     s.clear();

    // }

    public static void path(Node root, Stack<Integer> s, int k, int maxSoFar) {
        if (root == null) {
            return;
        }
        
        s.push(root.data);
        maxSoFar = Math.max(maxSoFar, root.data);

        if (root.left == null && root.right == null) {
            if (maxSoFar >= k) {
                System.out.println(s);
            }
        } else {
            path(root.left, s, k, maxSoFar);
            path(root.right, s, k, maxSoFar);
        }

        s.pop(); // backtrack
    }

    public static void main(String args[]) {

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
