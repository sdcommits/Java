public class LL {
    Node head;
    private int size;

    LL(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node (String data){
            this.data = data;
            this.next = null;
            size++;
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

    public void addLast (String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curNode = head;
        while(curNode.next !=null){
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    public void printLL( ){

        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node curNode = head;
        while(curNode!= null){
            System.out.print(curNode.data +"->");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("empty list");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println(" list is Empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return ;
        }
        Node secondLast = head ;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }




    public static void main(String args[]){
        LL list = new LL();
        list.addFirst("World");
        list.addFirst("Hello");
        list.addLast("Sheenam");
        // list.deleteFirst();
        // list.deleteLast();

        list.printLL();
       
    }
}

