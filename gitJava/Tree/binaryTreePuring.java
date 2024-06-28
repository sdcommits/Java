import java.util.*;

public class binaryTreePuring {

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

    // public static void addNode(Node root, ArrayList<Integer> a ){
    //     if(root == null){
    //         return;
    //     }
    //     if(root.data == 1){
    //         a.add(root.data);
    //         addNode(root.left,a);
    //         addNode(root.right,a);
    //     }
    //     if(root.data == 0 && root.left.data == 1 || root.right.data == 1){
    //         a.add(root.data);
    //         addNode(root.left,a);
    //         addNode(root.right,a);
    //     }
    //     else{
    //         a.add(-1);
    //     }

    //     for(int i : a){
    //         System.out.println(i);
    //     }
    // }

    public static void addNode(Node root, ArrayList<Integer> a) {
        if (root == null) {
            return;
        }

        if (root.data == 1 || (root.data == 0 && 
            ((root.left != null && root.left.data == 1) || 
             (root.right != null && root.right.data == 1)))) {
            a.add(root.data);
            addNode(root.left, a);
            addNode(root.right, a);
        } else {
            a.add(-1);
        }
    }

    public static void main(String args[]){
        int node[] = {1,0,1,0,0,0,1}; 
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
         ArrayList<Integer> b = new ArrayList<>();
        addNode(root, b);
            for(int i : b){
                System.out.println(i);
            }


    }
    
}


// import java.util.ArrayList;

// public class BinaryTreePruning {

//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class BinaryTree {
//         static int idx = -1;

//         public static Node buildTree(int[] nodes) {
//             idx++;
//             if (idx >= nodes.length || nodes[idx] == -1) {
//                 return null;
//             }
//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);
//             return newNode;
//         }

//         // Method to print the tree (for debugging)
//         public static void printTree(Node root) {
//             if (root == null) {
//                 return;
//             }
//             System.out.print(root.data + " ");
//             printTree(root.left);
//             printTree(root.right);
//         }
//     }

//     public static void addNode(Node root, ArrayList<Integer> a) {
//         if (root == null) {
//             return;
//         }

//         if (root.data == 1 || (root.data == 0 && 
//             ((root.left != null && root.left.data == 1) || 
//              (root.right != null && root.right.data == 1)))) {
//             a.add(root.data);
//             addNode(root.left, a);
//             addNode(root.right, a);
//         } else {
//             a.add(-1);
//         }
//     }

//     public static void main(String[] args) {
//         int nodes[] = {1,1,0,1,1,0,1,0}; 
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);

//         // Print the tree structure (for debugging)
//         System.out.print("Tree structure (pre-order): ");
//         tree.printTree(root);
//         System.out.println();

//         ArrayList<Integer> b = new ArrayList<>();
//         addNode(root, b);

//         // Print the ArrayList to verify the added nodes
//         System.out.println("Nodes added to the ArrayList:");
//         for (int i : b) {
//             System.out.print(i + " ");
//         }
//         System.out.println();
//     }
// }
