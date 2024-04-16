public class heightOfTree2 {

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

    static class BinaryTree {
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

    public static int heightOfTree(Node root){
        if (root == null){
            return 0;
        }
        int left = heightOfTree(root.left);
        int right = heightOfTree(root.right);

        return Math.max(left,right)+1;
    }

    public static void main(String args[]){
        int node[] = {1, 2, 4, 8, -1, -1, 9, -1, -1, 5, -1, -1, 3, 6, 10, -1, -1, 11, -1, -1, 7, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        System.out.println(heightOfTree(root));

        // System.out.println(result(root, 6, 8));
        
        
    }
    
}
