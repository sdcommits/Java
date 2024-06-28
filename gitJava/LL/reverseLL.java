import java.util.Scanner;

public class reverseLL {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addF(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void reverseLL(){
        if(head == null|| head.next == null ){
            return;
        }
        Node preNode = head;
        Node curNode = head.next;

        while(curNode!= null){
            Node nextNode = curNode.next;
            curNode.next = preNode;

            preNode = curNode;
            curNode = nextNode;
        }
        head.next = null;
        head = preNode;

    }

    public void printLL(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node curNode = head;
        while(curNode != null){
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.print("NULL");
    }

    public static void main(String srgs[]){
        reverseLL list = new reverseLL();
        Scanner sc = new Scanner(System.in);
        String[] str = new String[10];
        for(int i=0;i<3;i++){
            str[i] = sc.nextLine();
            list.addF(str[i]);
        }
        list.printLL();
        System.out.println("");
        list.reverseLL();
        list.printLL();
    }

    // public void addNode(String string) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'addNode'");
    // }   
}
