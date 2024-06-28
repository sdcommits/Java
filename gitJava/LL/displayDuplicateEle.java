import java.util.*;

public class displayDuplicateEle {
    Node head;
    class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addLL(int data){
        Node newNode =  new Node(data);
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
            System.out.println("List is empty");
            return;
        }
        while(curNode!=null){
            System.out.print(curNode.data+"->");
            curNode = curNode.next;
        }
        System.out.print("NULL");
    }

    
    public void duplicateEle(){
        Node curNode = head;
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        System.out.println("Duplicate Ele: ");
        while(curNode.next != null ){
            if(curNode.data == curNode.next.data){
                System.out.print(curNode.next.data + " ");
            }
            curNode = curNode.next;
        }
    }
    public static void main(String args[]){
        displayDuplicateEle list = new displayDuplicateEle();
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[100];
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
            list.addLL(arr[i]);   
        }
        // list.printLL();
        list.duplicateEle();
    }   
}
