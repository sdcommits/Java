class LL {
    Node head;
    public int size;

    LL(){
        this.size = 0 ;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

// ADD AT FIRST NODE
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;

    }

    public int size(){
        return size;
    }

    public void printlist(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
         
        Node currNode = head;
        while(currNode!= null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }

        System.out.println("Null");
    }

    public static void main(String args[]){
        LL list = new LL();
        list.addFirst("A");
        list.addFirst("is");
        list.printlist();
        list.addlast("list");
        list.printlist();

        list.addFirst("This");
        list.printlist();
        list.deleteLast();
        list.printlist();
        System.out.println(list.size);
        list.addFirst("Data");
        System.out.println(list.size);


    }

    
}
