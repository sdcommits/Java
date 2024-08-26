import java.util.*;

public class sumRootToLeafNumber {


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

    public static int sumRootLeaf(Node root){
        if(root == null ) return 0;
        int sum =0;
        return sum;
    }

    static int out;

    public static void path(Node root, ArrayList<Integer> s){
        if(root == null) return;
        s.add(root.data);

        if(root.left == null && root.right == null){
            StringBuilder str = new StringBuilder();
            for(int i =0; i<s.size();i++){
                str.append(s.get(i));
            }

            int num = Integer.parseInt(str.toString());
            out = out + num;
        }
        else{
            path(root.left, s);
            path(root.right,s);
        }

        System.out.println(" ");

        s.remove(s.size() -1);
    }


    public static void main(String args[]){
        // int node[] = {1, 2, 4, 8, -1, -1, 9, -1, -1, 8, -1, -1, 3, 6, 10, -1, -1, 11, -1, -1, 7, -1, -1};

        int node[] = {1, 2, -1, -1, 3, -1 ,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);

        ArrayList<Integer> s = new ArrayList<>();

        path(root, s);

        System.out.println(out);
    }
}
