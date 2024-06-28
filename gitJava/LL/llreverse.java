import java.util.*;

public class llreverse {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFisrst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printLL(){
        if (head == null){
            System.out.println("Empty");
            return;
        }
        Node curNode = head;
        while(curNode!=null){
            System.out.print(curNode.data+"->");
            curNode = curNode.next;
        }
        System.out.print("NULL");
    }

    public static void main(String args[]){

        llreverse list = new llreverse();
        int n;
        String[] str = new String[100];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=0;i<=n;i++){
            str[i] = sc.nextLine();
            list.addFisrst(str[i]);   
        }
        list.printLL();
    }
    
}
