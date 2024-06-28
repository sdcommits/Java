// import java.util.*;

class LinkLis {

    Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data =d ;
            next = null;
        }
    }

    void deleteNode(int key){
        Node first = head;
        Node second = head;

        for(int i=0;i<key;i++){
            if(second.next == null ){
                if(i==key-1){
                    head = head.next;
                    return;
                }
                second = second.next;
            }

            while (second.next != null){
                first = first.next;
                second = second.next;
            }
            first.next = first.next.next;
        }
    }
        

        public void push(int val)
        {
            Node new_node = new Node(val);
            new_node.next= head;
            head = new_node;
        }

        public void printList()
        {
            Node tnode = head;
            while(tnode != null){
                System.out.println(tnode.data + " ");
                tnode = tnode.next;
            }
        }
        

    public static void main(String args[])
    {
        LinkLis l1 = new LinkLis();

        l1.push(7);
        l1.push(5);
        l1.push(6);
        l1.push(2);
        l1.push(3);

        int n = 2;
        l1.deleteNode(n);

        System.out.println("\nList after deletetion: ");
        l1.printList();
    }
    }
    

