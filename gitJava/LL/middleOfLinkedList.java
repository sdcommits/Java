import java.util.*;

public class middleOfLinkedList {
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
    
    public int getLength(){
        int len = 0;
        if(head == null){
            len = 0;
            return 0;
        }
        Node temp = head;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }

        return len;
    }

    public void middleNode(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        int length = getLength();
        int middlelen = length/2;

        while(middlelen != 0){
            temp = temp.next;
            middlelen--;
        }
        System.out.println("Middle element: " + temp.data);
    }

    public static void main(String args[]){
        middleOfLinkedList list = new middleOfLinkedList();
        int n;
        String[]  arr = new String[1000];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLine();
            list.addNode(arr[i]);
        }
        // list.printNode();
        // list.middleNode();
        System.out.println(list.getLength());
        
    }
}
