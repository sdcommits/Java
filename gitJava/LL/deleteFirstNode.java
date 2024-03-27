import java.util.*;


public class deleteFirstNode {
    Node head;

    class Node{
        String data;
        Node next;

        Node (String data){
            this.data = data;
            this.next = null;
        }
    }     
        public void addFirst(String data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public void print(){
            Node currNode = head;
            if(head == null ){
                System.out.println("list is empty");
                return;
            }
            while(currNode.next!=null){
                System.out.print(currNode.data+"->");
                currNode = currNode.next;
            }
            System.out.println("Null");
        }
        public void deleteFirst(){

            if(head == null ){
                System.out.println("Empty");
                return;
            }
            Node curNode = head.next;
            while (curNode.next!=null) {
                System.out.print(curNode.data+"->");
                curNode = curNode.next;    
            }
            System.out.print("Null");
        }
        public static void main(String args[]){

            deleteFirstNode list = new deleteFirstNode();

            String[] str = new String[100];
            Scanner sc = new Scanner(System.in);
            int n;
            n = sc.nextInt();
            for (int i=0;i<=n;i++){
                str[i] = sc.nextLine();
                list.addFirst(str[i]);   
            }
            list.print();
            System.out.println(" ");
            list.deleteFirst();
        }   
}
