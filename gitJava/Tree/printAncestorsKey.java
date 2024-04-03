public class printAncestorsKey {

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
            newNode.right = buildTree (nodes);
            return newNode;
        }
    }

    public static boolean show(Node root, int k){
        if(root ==  null)
            return false;
        
        if(root.data == k)
            return true;
        
        if(show(root.left, k) || show(root.right, k)){
            System.out.println(root.data);
            return true;
        }
        return false;
    }

    public static void main(String args[]){

        // int node[] = {1,2,4,-1,-1,5,-1,-1,-3,10,-1,-1,-1,6,-1,-1};
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        System.out.println(root.data); 
        // System.out.println(show(root,6));
        show(root, 4);
    }

    
    
}
