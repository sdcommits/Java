import java.util.*;

public class reverseLLInGroup {
    Node head;
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addLL(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        return;
    }
    public void printLL(){
        Node curNode = head;
        if(head == null){
            System.out.println("empty");
            return;
        }
        while(curNode!=null){
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    public int length(){
        int len = 0;
        Node curNode  = head;
        while(curNode!=null){
            len++;
            curNode = curNode.next;
        }
        return len;
    }

    public Node rotateLLInGroup(Node head,int x){
        if(head == null){
            return null;
        }
        Node curNode = head;
        Node nex = null;
        Node prev = null;
        int c = 0;
        while(c<x && curNode!= null){
            nex = curNode.next;
            curNode.next = prev;
            prev = curNode;
            curNode = nex;
            c++;
        }
        if(nex != null){
            head.next = rotateLLInGroup(nex,x);
        }

        return prev;    
    }

    public static void main(String args[]){
        reverseLLInGroup list = new reverseLLInGroup();
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[100];
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
            list.addLL(arr[i]);   
        }
        list.printLL();
        // System.out.println(list.length());
        list.head = list.rotateLLInGroup(list.head,3);
        list.printLL();
    }         
}
