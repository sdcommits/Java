import java.util.*;

public class pairSumElements {
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
    public static void sum(Node root, int k) {
        if (root == null) {
            return;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        populateArr(root, k, arr); 

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == k) {
                    System.out.println(arr.get(i) + " " + arr.get(j));
                }
            }
        }
    }
    public static void populateArr(Node root, int k, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        if (root.data < k) {
            arr.add(root.data);
        }
        populateArr(root.left, k, arr);
        populateArr(root.right, k, arr);
    }
    public static void main(String args[]){
        int node[] = {1,2,4,-1,-1,7,-1,-1,3,-1,7,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        System.out.println(root.data); 
        // System.out.println(sum(root, 6));
        sum(root, 7);
    }
    
}
