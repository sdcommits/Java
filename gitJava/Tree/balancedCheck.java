public class balancedCheck {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }}
    static class BinaryTree{
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

    public static boolean balanced(Node root){
        int lh = 0;
        int rh = 0;
        if(root == null)
            return true;
        lh = height(root.left);
        rh = height(root.right);
        
        if(Math.abs(lh-rh)<=1 && balanced(root.right) && balanced(root.left))
            return true;
    return false;
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return 1+ Math.max(height(root.left) ,
         height(root.right));
    }

    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,-1,-1,3,-1,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree (nodes);
        System.out.println(balanced(root));
    }   
}
