public class removeMiddle {

    static Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
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
        while(curNode.next!= null){
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
        while(curNode!= null){
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    } 


    // public int length(){
    //     Node curNode = head;
    //     int c = 0;
    //     while(curNode != null){
    //         curNode = curNode.next;
    //         c++;
    //     }
    //     return c;
    // }

    public void middle(){
        Node curNode = head;
        // Node temp = head;
        // int c= length();

        Node temp = head;
        int c = 0;
        while(temp != null){
            temp = temp.next;
            c++;
        }

        if(head == null || head.next == null){
            c = 0;
            return;
        }
        int m = c/2;
        while(curNode != null){
            if(m == 1){
                curNode.next = curNode.next.next;
            } 
            curNode = curNode.next;
            m--;
        }
    }

    
    public static void main(String args[]){
        removeMiddle list = new removeMiddle();
        // list.addLast(1);
        list.addLast(1);
        list.addLast(1);
        list.addLast(2);
        list.addLast(6);
        list.addLast(3);
        list.addLast(4);
        list.addLast(1);
        list.printLL();
        list.middle();
        list.printLL();

    }
    
}
