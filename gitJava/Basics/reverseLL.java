class reverseLL {
    Node head;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }  

    public void addFir(String data){
        Node newNode = new Node(data);
        if(head == null){
           head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void reverse(){

        if(head == null || head.next == null){
            return;
        }
        Node preNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = preNode;

            // update
            preNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = preNode;
    }


     

    public void printlist(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    
    public static void main(String args[]){
        llPractice list = new llPractice();
        list.addFir("Sheenam");
        list.addFir("Name:");
        list.addFir("my");
        list.addFir("age");
        list.addFir("home");
        list.printlist();
        // list.reverse();

    }
}
