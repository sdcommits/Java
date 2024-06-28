import java.util.*;

public class deleteTheNode {
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
    public static Node insert(Node root,int val){
        if(root == null){
           root = new Node(val);
           return root;
        }
        if(root.data>val){
            root.left = insert(root.left,val); 
        }
        else {
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Node deleteValue(Node root,int val){
        if(root.data>val){
            root.left = deleteValue(root.left, val);
        }
        if(root.data<val){
            root.right = deleteValue(root.right,val);
        }

        else{ // root.data == val 

            //case 1------->>(0 child)
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2------->>(1 child)
            if(root.left == null){
                return root.right;
            }  
            if(root.right == null){
                return root.right;
            }

            //case 3--------->> (more than 1 child)
            Node Is = inorderSuccessor(root.right);
            root.data = Is.data;
            root.right = deleteValue(root.right, Is.data);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void main(String args[]){
        int arr[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0;i<arr.length;i++){
            root = insert(root, arr[i]);
        }
        deleteValue(root, 10);
        inorder(root);
    }   
}
