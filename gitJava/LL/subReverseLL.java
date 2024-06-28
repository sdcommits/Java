public class subReverseLL {

    Node head;
    class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data){
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
        return;
    }

    public void printLL(){
        Node curNode = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(curNode != null){
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    public int length(){
        if(head == null){
            return 0;
        }
        int l = 0;
        Node curNode = head;
        while(curNode != null){
            l++;
            curNode = curNode.next;
        }
        return l;
    }

    public void subReverse(int first, int last){
        if(head == null || head.next == null){
            return;
        }
        Node preNode = head;
        Node curNode = head.next;
        int l = length();
        



    }

    public static void main(String args[]){
        subReverseLL list = new subReverseLL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.printLL();
        System.out.println(list.length());
        // list.subReverse(4);
        // list.printLL();
    }   
}









