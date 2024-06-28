public class removeLLElement {
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

    public void removeElement(Node head, int val){
        Node curNode = head;
        Node preNode = null;

        if(head == null ){
            System.out.println("list is empty");
            return;
        }
        
        while(curNode.next!= null){
            if(preNode.next.data == val){
                preNode = curNode;
                curNode = curNode.next;
                preNode.next = preNode.next.next;     
                // curNode.next = curNode.next.next  ;
            }    
        }
    }  
    public static void main(String args[]){
        removeLLElement list = new removeLLElement();
        // list.addLast(1);
        list.addLast(1);
        list.addLast(1);
        list.addLast(2);
        list.addLast(6);
        list.addLast(3);
        list.addLast(4);
        list.addLast(1);
        list.printLL();
        list.removeElement(head,1);
        list.printLL();
    }
}
