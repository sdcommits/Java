public class checkDuplicate {

    static class Node{
        int data;
        Node right;
        Node left;

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
            if (nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    static boolean checkDuplicate(Node root, int val){
        if(root == null){
            return false;
        }
        if(val == root.data && root.data != -1){
            return true;
        }
        else{
            boolean left = checkDuplicate(root.left, val);
            boolean right = checkDuplicate(root.right, val);
            return left|| right;
        }
    }

    static boolean check(Node root){
        if(root != null){
            if(checkDuplicate(root.left, root.data)) return true;
            if(checkDuplicate(root.right, root.data)) return true;
            return check(root.left)|| check(root.right);
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        int nodes[] = {1,1,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree (nodes);
        System.out.println(check(root));
    }    
}
