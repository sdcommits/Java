public class printBoundary {
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

    public static void printLeaves(Node root){
        if(root == null)
            return;
        
        printLeaves(root.left);
        if(root.left == null && root.right == null)
            System.out.println(root.data);
        
        printLeaves(root.right);
        
    }

    public static void printLeft(Node root){
        if(root == null)
            return;
        

        if(root.left != null){
            System.out.println(root.data );
            printLeft(root.left);
        }
        else if(root.right != null){
            System.out.println(root.data);
            printLeft(root.right);
        }
    }

    public static void printRight(Node root){
        if(root == null)
            return;
        
        if (root.right != null){
            printRight(root.right);
            System.out.println(root.data);
        }
        else if( root.left!= null){
            printRight(root.left);
            System.out.println(root.data);
        }
    }

    public static void printBoundary(Node root){
        if(root == null)
            return;

        System.out.println(root.data);
        

        printLeft(root.left);
        printLeaves(root.left);
        printLeaves(root.right);
        printRight(root.right);

    }

  


    public static void main(String args[]){
        int node[] = {1, 2, 4, 8, -1, -1, 9, -1, -1, 5, -1, -1, 3, 6, 10, -1, -1, 11, -1, -1, 7, -1, -1}

        ;
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        printBoundary(root); 
    }


    
}
