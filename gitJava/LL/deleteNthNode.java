import java.util.*;

public class deleteNthNode {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addF(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        
    }

    public void printll(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node curNode = head;
        while(curNode.next!=null){
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.print("NULL");
    }

    public void lastNode(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node curNode = head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
            curNode = curNode.next;
        }
        curNode.next = null;
    }

    public static void main(String args[]){
        deleteNthNode list = new deleteNthNode();
        int n;
        String[] str = new String[10];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            str[i] = sc.nextLine();
            list.addF(str[i]);   
        }
        list.printll();
        list.lastNode();
        list.printll();
    }   
}
