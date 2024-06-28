public class sunOfDiffLevel {
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
    
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);
        return Math.max(l,r) + 1;
    }

    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        return root.data - root.left.data - root.right.data;
        
    }

    public static void main(String args[]){

        // int node[] = {1,2,4,-1,-1,5,-1,-1,-3,10,-1,-1,-1,6,-1,-1};
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        System.out.println(root.data);
        System.out.println(sum(root));  
    }
}
