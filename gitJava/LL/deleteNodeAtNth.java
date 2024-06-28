import java.util.Scanner;

public class deleteNodeAtNth {

    static Node head;
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

    public void printll(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node curNode = head;
        while(curNode.next!=null){
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.print("NULL");
    }
    public int length(){
        int l = 0;
        Node curNode = head;
        while(curNode!= null){
            l++;
            curNode  = curNode.next;
        }
        return l;
    }

    public Node deleteFrontGivenNode(Node head ,int k){
        Node curNode = head;

        if (head == null){
            return null;
        }
        if(head ==  head.next){
            return null;
        }
        int c = 0;
        while(curNode.next!=null){
            if(c == k){
                curNode.next = curNode.next.next;
                c++;
            }
            curNode = curNode.next;
            c++;
        }
        return curNode;
    }


    // public Node deleteGivenNode(int k){  
    //     Node preNode = head;
    //     Node curNode = head.next;
    //     Node nextNode = curNode.next;

    //     int l = length();
    //     int c = l;
    //     while(c!=k && nextNode.next == null){
    //         preNode = curNode;
    //         curNode = nextNode;
    //         nextNode = nextNode.next;
    //         c--;
    //         if(c==k){
    //             preNode = nextNode;
    //             nextNode = nextNode.next; 
    //             c--;
    //         }
    //     }
    //     return preNode;

    // }

    public static void main(String args[]){
        deleteNodeAtNth list = new deleteNodeAtNth();
        int n;
        String[] str = new String[10];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            str[i] = sc.nextLine();
            list.addF(str[i]);   
        }
        list.printll();
        // list.deleteGivenNode( 3);
        list.deleteFrontGivenNode(head, 3);
        System.out.println("");
        list.printll();
    }   
    
}
