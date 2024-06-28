import java.util.*;


public class findingMiddleofNodes {
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

        public int getLenth(){
            int len = 0;
            if(head== null){
                len = 0;
                return 0;
            }
            Node temp = head;
            while(temp != null){
                len++;
                temp = temp.next;
            }
            return len;
        }

        public void middleNode(){
            if(head != null){
                int lenght = getLenth();
                Node temp = head;
                int middlelen = lenght/2;
                while (middlelen != 0){
                    temp = temp.next;
                    middlelen--;
                }
                System.out.println("Middle of Nodes is: " + temp.data);
            }
        }


        public static void main(String args[]){

            findingMiddleofNodes list = new findingMiddleofNodes();

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
            System.out.print("Lenght: ");
            // list.getLenth();
            list.middleNode();

            // list.middleNode();
            // list.deleteFirst();
        }   
}
