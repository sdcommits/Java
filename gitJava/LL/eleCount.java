import java.util.Scanner;

public class eleCount {
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

    public void eleCount(int n){
        
        Node curNode = head;
        int c = 0;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(curNode!= null){
            if(n == curNode.data){
                c++;
            }
            curNode = curNode.next;
        }
        System.out.println(" "+n+" is of "+c+" times");
    }

    public static void main(String args[]){
        eleCount list = new eleCount();
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
        list.eleCount(name);
      
    }   

    
}
