import java.util.*;

public class reverseinLL {
    static Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        // Node curNode = head;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
       
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head== null){
            head = newNode;
            return;
        }
        Node curNode = head;
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

    public void reverse(){

        if(head == null || head.next == null){
            return;
        }
        Node preNode = head;
        Node curNode = head.next;
        while(curNode != null){
            Node nexNode = curNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = nexNode;
        }
        head.next = null;
        head = preNode;
    }

    public static void main(String args[]){
        reverseinLL list = new reverseinLL();
        int n;
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            list.addLast(arr [i]);  
        }
        list.printLL();
        list.reverse();
        list.printLL();
    }    
}
