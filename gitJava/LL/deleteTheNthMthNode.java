import java.util.*;

public class deleteTheNthMthNode {

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
    public int length(){
        Node curNode = head;
        int len = 0;
        while(curNode != null){
            len++;
        }
        return len;
    
    }
    public void deleteNode(int s,int t){
        Node curNode = head;
        int c = length();
        int l = 0;
        while(l<s && c>s){
            System.out.print(curNode.data + " ");
            l++;
            c--;
            curNode = curNode.next;
        }
        
    }

    public static void main(String args[]){
        deleteTheNthMthNode list = new deleteTheNthMthNode();
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[100];
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
            list.addLL(arr[i]);   
        }
        // int m,t;
        // System.out.println("Enter the positions: ");
        // m = sc.nextInt();
        // t = sc.nextInt();
        list.deleteNode(4,5);
        // list.printLL();
    } 
    
}
