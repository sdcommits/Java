import java.util.Scanner;

public class deletingTheNthNode {

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
        while(curNode!=null){
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.print("NULL");
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curNode = head;
        while(curNode.next!=null){
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    public int length(){
        Node curNode = head;
        int len = 0;
        while(curNode.next!= null){
            len++;
            curNode = curNode.next;
        }
        return len;
    }

    // public Node deleteNthNode(int k){
    //     Node curNode = head;
    //     int l = length();
    //     // int m = l-1;

    //     if(head == null){
    //         return null;
    //     }
    //     if(curNode.next == null){
    //         return curNode;
    //     }
    //     if(l == k){
    //         Node temp = head.next;
    //         head.next = null;
    //         return temp;
    //     }
        
    //     while(curNode.next != null){
    //         if(l == k){
    //             curNode.next = curNode.next.next;
    //             l--;
    //         }
    //         curNode = curNode.next;
    //         l--;
    //     }
    //     return curNode;
    // }


    public Node deletingNthNode(Node head, int k){
        int l = length();
        int N = l-k+1;

        Node pre = null;
        Node temp = head;

        for(int i =1;i<N;i++){
            pre = temp;
            temp = temp.next;
        }
        if(pre == null){
            head = head.next;
            return head;
        }
        else{
            pre.next = pre.next.next;
            return head;
        }


        // return head;
    }

    public static void main(String args[]){
        deletingTheNthNode list = new deletingTheNthNode();
        int n;
        String[] str = new String[10];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<=n;i++){
            str[i] = sc.nextLine();
            list.addLast(str[i]);   
        }
        list.printll();
        // System.out.println(list.length());
        list.deletingNthNode(head,1);
        list.printll();
    }   
    
}
