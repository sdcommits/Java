import java.util.*;

public class largestLevelEle {

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
        public static Node buildTree(int node[]){
            idx++;
            if(node[idx] == -1){
                return null;
            }
            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);
            return newNode;
        }
    }

    static int maxLevel = 0;

    public static ArrayList<Integer> listRoot(Node root){
        ArrayList<Integer> arr = new ArrayList<>();
        checkList(root, 1, arr);
        return arr;
    }



    static void checkList(Node root, int height, ArrayList<Integer> arr){
        if(root == null){
            return;
        }

        if(maxLevel<height){
            if(root.left != null && root.right != null){
                arr.add(Math.max(root.left.data , root.right.data));
            }
            if(root.left!= null && root.right == null){
                arr.add(root.left.data);
            }
            if(root.left == null && root.right != null){
                arr.add(root.right.data);
            }
            if(root.left == null && root.right == null){
                return;
            }
            maxLevel = height;
        }

        checkList(root.left, height + 1, arr);
        checkList(root.right, height + 1, arr);
    }

    

    public static void main(String args[]){
        int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(listRoot(root));
    }
}
