public class checkCousins {
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
            if(nodes[idx]  == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    public static boolean cousin(Node root, Node a, Node b){
        if(root == null){
            return false;
        }

            return (root.left == a && root.right == b) 
            || (root.left == b && root.right == b) 
            || cousin(root.left, a, b) || cousin(root.right, a, b);
    }

    public static int length(Node root, Node a, int len){
        if(root == null){
            return 0;
        }
        if (root == a){
            return len;
        }
        int l = length(root.left, a, len+1);
        if(l != 0){
            return l;
        }
        return length(root.right, a, len+1);
    }
    public static boolean check(Node root, Node a, Node b){
        return (length(root.left, a, 1) == length(root.right, b, 1) && !cousin(root, a,b));
        
    }

    public static Node nodee(Node root,int a){
        if(root == null){
            return null;
        }
        if(root.data == a)
            return root;
        return null;
    }
    public static void main(String args[]){
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        System.out.println(root.data); 
        // System.out.println(cousin(root.left, 6, 5));
        System.out.println(check(root.left, nodee(root, 5), nodee(root, 6)));
    }

    
}
