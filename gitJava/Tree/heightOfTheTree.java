import java.util.*;

// import binary_tree.BinaryTree;

public class heightOfTheTree {
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
    
    static class binaryTree{
        static int idx = -1;

        public static Node buildTree(int nodes[]){
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
    
    // public static int heightOfTree(Node root){
    //     if(root == null){
    //         return 0;
    //     }
    //     int leftHeight = heightOfTree(root.left);
    //     int rightHeight = heightOfTree(root.right);
    //     int maxHeight = Math.max(leftHeight, rightHeight);
    //     return maxHeight + 1;
    // }

    public static int sum(Node root){
        int leftData = 0;
        int rightData = 0;
        if(root == null || root.left == null && root.right == null){
            return 1;
        }
        else{
            if(root.left!= null)
            leftData = root.left.data;
            
            if(root.right != null)
            rightData = root.right.data;
            
            if(root.data == leftData + rightData && (sum(root.left) != 0) && (sum(root.right) != 0) ){
                return 1;
            }
            else{
                return 0;
            }
        }
    }

    public static void main(String args[]){
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree = new binaryTree();
        Node root = tree.buildTree(node);

        System.out.println(sum(root));
    }   
}

