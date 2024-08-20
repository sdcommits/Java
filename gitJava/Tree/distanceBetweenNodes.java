public class distanceBetweenNodes {
    
    public static int ans;
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

    public static int findingDistance(Node root, int n1, int n2){
        if(root == null) return 0;
        
        int left = findingDistance(root.left, n1, n2);
        int right = findingDistance(root.right, n1,n2);

        if(root.data == n1 || root.data == n2 ){
            if(left != 0 || right != 0){
                ans = Math.max (left, right);
                return 0;
            }
            else{
                return 1;
            }
            
        }
        else if(left != 0 && right != 0){
            ans = left + right;
            return 0;
        }
        else if(left != 0 || right != 0)
            return Math.max(left,right)+1;
        return 0;
    }

    public static int result(Node root, int n1, int n2) {
        ans = 0;
        findingDistance(root, n1, n2);
        return ans;

    }

    public static void main(String args[]){
        int node[] = {1, 2, 4, 8, -1, -1, 9, -1, -1, 5, -1, -1, 3, 6, 10, -1, -1, 11, -1, -1, 7, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);

        System.out.println(result(root, 6, 8));
        
        
    }
    
}
