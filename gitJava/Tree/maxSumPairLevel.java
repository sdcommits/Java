import java.util.*;

public class maxSumPairLevel {
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

    public static int res(Node root){
        if(root == null){
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        int result = root.data;
        q.add(root);
        while(!q.isEmpty()){
            int count = q.size();
            int sum = 0;

            while(count-->0){
                Node temp = q.poll();
                sum = sum + temp.data;

                if(temp.left!= null )
                    q.add(temp.left);

                if(temp.right!= null)
                    q.add(temp.right);

                }
                result = Math.max(result, sum);  
        }
        return result;

    }

    

    public static void main(String args[]){
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        System.out.println(root.data); 
        System.out.println(res(root));
        // System.out.println(cousin(root.left, 6, 5));
    }
    
}
