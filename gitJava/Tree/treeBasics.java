public class treeBasics {
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

    public static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }
        int leftheight = heightOfTree(root.left);
        int rigtheight = heightOfTree(root.right);
        
        int maxheight = Math.max(leftheight,rigtheight);
    
        return maxheight + 1;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3 = heightOfTree(root.left) + heightOfTree(root.right) +1;
        return Math.max(dia3, Math.max(dia1,dia2));
    }

    public static void main(String args[]){
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        // System.out.println(root.data);
        // preorderBinaryTree(root);
        // System.out.println(diameter(root));l
        System.out.println(heightOfTree(root));
    }   
}
