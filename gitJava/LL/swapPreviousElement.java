import java.util.Scanner;

public class swapPreviousElement {

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
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curNode = head;
        while(curNode.next != null){
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    void printLL(){
        Node curNode = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(curNode!= null){
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    void swapEle(int t){
        Node pre = null;
        Node curNode = head;

        if(head == null){
            return;
        }
        while(curNode.next != null){
            pre = curNode;
            curNode = curNode.next;
            if(curNode.data == t){
                int temp = curNode.data;
                curNode.data = pre.data;
                pre.data = temp;
                curNode = curNode.next;
            }
        }
    }

    public static void main(String args[]){
        swapPreviousElement list = new swapPreviousElement();
        int n, target;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[100];
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
            list.addLL(arr[i]);   
        }
        list.printLL();
        list.swapEle(4);
        list.printLL();

    }


    
    
}
