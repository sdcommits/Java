import java.util.*;

public class printInRange {
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

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static void printRange(Node root, int X, int Y){

        if(root ==  null){
            return;
        }

        if(root.data >= X && root.data<=Y){
            printRange(root.left,X,Y);
            System.out.print(root.data + " ");
            printRange(root.right,X,Y);
        }
        else if(X > root.data){
            printRange(root.right,X,Y);
        }
        else if(Y < root.data){
            printRange(root.left,X,Y);
        }
    }

    public static void inorder(Node root){
        if(root ==  null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String args[]){
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i=0;i<val.length;i++){
        root = insert(root, val[i]);     
        }
        printRange(root, 6, 12);

        // inorder(root);

    }
    
}
