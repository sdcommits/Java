import java.util.*;

public class reverseTheLL {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addNode(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void reverse(){
        if(head == null || head.next ==  null){
            return;
        }
        Node pre = head;
        Node curr = head.next;
        while(curr.next != null ){
            Node newNode = curr.next;
            curr.next = pre;
            pre = curr;
            curr = newNode;    
        }
        head.next = null;
        head = pre;
    }

    public void printNode(){
        Node curNode = head;
        if (head ==  null){
            System.out.println("List is empty");
            return;
        }

        while (curNode.next!= null){
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.print("NULL");

    } 

    public static void main(String args[]){
        reverseTheLL list = new reverseTheLL();
        int n;
        String[] str = new String[10000];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // n = sc.nextInt();
        for(int i=0;i<n;i++){
            str[i] = sc.nextLine();
            list.addNode(str[i]);
        }
        list.printNode(); 
        System.out.println("");
        list.reverse(); 
        list.printNode();    
    }
    
    
}
