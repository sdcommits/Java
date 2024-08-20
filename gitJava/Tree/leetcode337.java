public class leetcode337 {


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
            Node root = new Node(nodes[idx]);
            root.left = buildTree(nodes);
            root.right = buildTree(nodes);
            return root;
        }
    }

    public static int rob(Node root){
        // int sum = 0;
        int c = 1;

        int n = odd(root, c);

        return n;

    }

    static int sum;
    static int num;

    public static int odd(Node root, int c ){
        if(root == null) return 0;

        sum = sum + root.data;

        if(root.left == null && root.right == null){
            return sum;
        }
        else if(c%2 != 0){
           sum += odd(root.left, c++);
            sum += odd(root.right, c++);
        }
        return sum;
    }

    public static int even(Node root, int c){
        if(root == null) return 0;

        if(c%2 == 0){
            sum = sum + root.data;
        }

        



        return num;


    }



    public static void main(String args[]){

        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        System.out.println(root.data); 
        System.out.println(rob(root));

    }
    
}
