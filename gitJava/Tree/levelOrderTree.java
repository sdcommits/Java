import java.util.*;

public class levelOrderTree {

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
            if(nodes[idx] == -1 ){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    static void preorderBinaryTree(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preorderBinaryTree(root.left);
        preorderBinaryTree(root.right);
    }

    public static void levelOreder(Node root){

    Queue <Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);

    while(!q.isEmpty()){
        Node curNode = q.remove();
        if(curNode == null){
            System.out.println("");
            if(q.isEmpty()){
                break;
            }
            else{
                q.add(null);
            }
        }
        else{
            System.out.print(curNode.data+" ");
            if(curNode.left!=null){
                q.add(curNode.left);
            }
            if(curNode.right!=null){
                q.add(curNode.right);
            }
        }
    }
}

public static int countOfNodes(Node root){
    if(root == null){
        return 0;
    }
    int leftroot = countOfNodes(root.left);
    int rightroot = countOfNodes(root.right);
    return leftroot+rightroot + 1;
}
public static int sumOfData(Node root){
    int sum = 0;
    if(root == null){
        return 0;
    }
    int leftSum = sumOfData(root.left);
    int rightSum = sumOfData(root.right);

    return leftSum + rightSum + root.data;

}
public static int heightOfTree(Node root){
    if(root == null){
        return 0;
    }

    int leftheight = heightOfTree(root.left);
    int rigtheight = heightOfTree(root.right);
    
    int maxheight = Math.max(leftheight,rigtheight);

    return maxheight + 1;
}
    public static void main(String args[]){
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        // System.out.println(root.data);
        // preorderBinaryTree(root);
        // levelOreder(root);
    //    System.out.println(countOfNodes(root));
    //    System.out.println(sumOfData(root));
    System.out.println(heightOfTree(root));
    }   
}
