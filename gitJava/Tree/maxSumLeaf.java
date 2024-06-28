public class maxSumLeaf {

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


    //Solution 1------------------>>>>>>>>>>>
    static int maxSum;
    public static int sumOut(Node root, int sum){
        if(root == null){
            return 0;
        }
        sum = sum+root.data;
        if(root.left == null && root.right == null && sum > maxSum){
            maxSum = sum;
        }
        sumOut(root.left, sum);
        sumOut(root.right, sum);

        return maxSum;
    }


     //Solution 2------------------>>>>>>>>>>>

    // static int maxSum = Integer.MIN_VALUE;
    // static Node maxLeaf=null;
    // public static void maxSum(Node root, int sum){
    //     if(root!=null){
    //         sum=sum+root.data;
    //         if(sum>maxSum && root.left==null && root.right==null){
    //             maxLeaf = root;
    //             maxSum = sum;
    //         }
    //         //	System.out.println("Sum " + sum);
    //         maxSum(root.left,sum);
    //         maxSum(root.right,sum);
    //     }
    // }
    // public static Boolean path(Node root, Node leaf){
    //     if(root==null) return false;
    //     if ((root == leaf) || path(root.left, leaf) ||path(root.right, leaf) )
    //     {
    //         System.out.print(" " + root.data);
    //         return true;
    //     }
    //     return false;
    // }


    public static void main(String args[]){
        // int node[] = {1, 2, 4, 8, -1, -1, 9, -1, -1, 5, -1, -1, 3, 6, 10, -1, -1, 11, -1, -1, 7, -1, -1}

        int node[] = {1,2,4,-1,-1,5,-1,-1,-3,10,-1,-1,-1,6,-1,-1};

        ;
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        System.out.println(sumOut(root, maxSum));
        // maxSum(root,0);
        // System.out.println("Maximum Sum Leaf to Root path " + maxSum);
        // System.out.print("Path :");
        // path(root,maxLeaf);
        
        
    }
    
}
