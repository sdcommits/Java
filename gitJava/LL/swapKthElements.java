import java.util.Scanner;

public class swapKthElements {
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

    public int lenght(){
        Node curNode = head;
        if(head == null){
            System.out.println("List is empty");
            return 0;
        }
        int c = 0;
        while(curNode!= null){
            c++;
            curNode = curNode.next;
        }
        return c;
    }
    public void swapKthEle(int n){
        Node curNode = head;
        Node temp = head;

        int c = 1;
        Node s,t;
        int len = lenght();
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        System.out.println();
        while(curNode != null){
            c++;
            curNode = curNode.next;
            temp = temp.next;
            if(c == n){
                System.out.println(curNode.data); 
            }
            if(c == len-n+1){
                System.out.println(temp.data);   
            }  
        }  
    }
    public static void main(String args[]){
        swapKthElements list = new swapKthElements();
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[100];
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
            list.addLL(arr[i]);   
        }
        int name;
        System.out.println("Enter the number: ");
        name = sc.nextInt();
        list.printLL(); 
        // System.out.println("Lenght is "+ list.lenght()); 
        list.swapKthEle(name);
        list.printLL();
    }      
}
