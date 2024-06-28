public class elementAfterMiddle {
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
    }

    public void printLL(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node curNode = head;
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
        Node curNode = head;
        int l = 0;
        while(curNode != null){
            l++;
            curNode = curNode.next;
        }
        return l;   
    }

    public void afterMiddle(){
        if(head == null){
            return;
        }
        int l = length();
        int c = 0;
        Node curNode = head;
        while(curNode != null){
            if(c >= l/2){
                System.out.println(curNode.data);
            }
            curNode = curNode.next;
            c++;

        }

    }



    public static void main(String args[]){
        elementAfterMiddle list = new elementAfterMiddle();
        list.addLast(5);
        list.addLast(2);
        list.addLast(8);
        list.addLast(3);
        list.addLast(1);
        list.addLast(6);
        list.printLL();
        list.afterMiddle(); 
    } 
}
