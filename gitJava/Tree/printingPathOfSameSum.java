import java.util.*;

public class printingPathOfSameSum {
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

    public static void pathSum(Node root){

        ArrayList<Integer> path = new ArrayList<>();
            check(root, path, 11);

    }

    public static void check(Node root,ArrayList<Integer> arr, int k){
        if(root == null){
            return ;
        }
        // ArrayList<Integer> arr = new ArrayList<>();
        arr.add(root.data);
        if(root.left == null && root.right == null){
            // for(int i =0;i<arr.size();i++){
            //     System.out.print(arr.get(i)+ " ");
            // }
            // System.out.println(" ");
            int sum = 0;
            for(int i =0;i<arr.size();i++){
                sum = sum + arr.get(i);
            }
            if(sum == k){
                for(int i =0;i<arr.size();i++){
                        System.out.print(arr.get(i)+ " ");
                    }
                    System.out.println(" ");
            }
        }
        else{
            check(root.left, arr,11);
            check(root.right, arr, 11);
        }

        arr.remove(arr.size()-1);  
    }


    public static void main(String[] args) {

        int node[] = {1, 2, 4, 8, -1, -1, 9, -1, -1, 8, -1, -1, 3, 6, 10, -1, -1, 11, -1, -1, 7, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        // System.out.println(root.data);
        pathSum(root);
    }
    
}
