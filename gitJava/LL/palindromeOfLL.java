import java.util.*;

public class palindromeOfLL {

    static Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        Node curNode = head;
        if(head == null){
            head = newNode;
            return;
        }
        while(curNode.next!=null){
            curNode = curNode.next;
        }
        curNode.next = newNode;

    }

    public void printLL(){
        Node curNode = head;
        if(head == null){
            return;
        }
        while(curNode!=null){
            System.out.print(curNode.data+"->");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    public boolean reverse (Node head){
        Stack<Integer> stack = new Stack<>();
        if(head == null || head.next == null){
            return true;
        }
        Node curNode = head;

        boolean out = true;
        while(curNode != null){
            stack.push(curNode.data);
            curNode = curNode.next;    
        }

        while(head != null){
            int i = stack.pop();
            if(head.data == i){
                out = true;
            }
            else{
                out  = false;
            }
            head = head.next;
        }
        return out;
    }

    


    public static void main(String args[]){
        palindromeOfLL list = new palindromeOfLL();
        int n;
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            list.addLast(arr [i]);  
        }
        list.printLL();
        // list.reverse(head);
        // list.printLL();
        System.out.println(list.reverse(head));
        
    }   
    
}
