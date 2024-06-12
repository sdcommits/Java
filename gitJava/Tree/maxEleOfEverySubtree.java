import java.util.*;

public class maxEleOfEverySubtree {
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

    public static int maxEle(Node root, int maxVal){
        if(root ==  null){
            return 0;
        }
        maxVal = root.data;
        if(root.left != null && root.right != null){
            maxVal = Math.max(maxVal, Math.max(root.right.data, root.left.data));
        }
        else if(root.left == null && root.right != null){
            maxVal = Math.max(maxVal, root.right.data);
        }
        else if(root.left != null && root.right == null){
            maxVal = Math.max(maxVal, root.left.data);
        }
        int leftMax = maxEle(root.left,maxVal);
        int rightMax = maxEle(root.right,maxVal);

        return Math.max(maxVal, Math.max(leftMax, rightMax));
    }

    public static void print(Node root){
        if (root == null){
            return ;
        }
        int out = maxEle(root, Integer.MAX_VALUE);
        System.out.print(out + " ");
        print(root.left);
        print(root.right);
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

        // maxEle(root, Integer.MAX_VALUE);

        print(root);
    }


    
}
