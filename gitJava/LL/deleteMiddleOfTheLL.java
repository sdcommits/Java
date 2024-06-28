import java.util.*;

public class deleteMiddleOfTheLL {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void AddLL(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printLL() {
        Node curNode = head;
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        while (curNode.next != null) {
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.print("Null");
        ;
    }

    public int getlen() {
        int len = 0;
        Node current = head;
        while (current.next != null) {
            len++;
            current = current.next;
        }
        return len;
    }

    public void middle() {
        // int midlen;
        if (head != null) {
            int lenght = getlen();
            Node temp = head;
            int midlen = lenght / 2;
            while (midlen != 0) {
                temp = temp.next;
                midlen--;
                
            }
            System.out.println(temp.data);
        }
    }

    public Node deleteMiddle() {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }

        Node tem = head;
        int len = getlen();
        int mid = len / 2;
        while (mid != 0) {
            tem = tem.next;
            mid--;
            if (mid == 1) {  
                tem.next = tem.next.next;
            }
        }
        return tem;
    }

    public static void main(String args[]) {
        int n;
        deleteMiddleOfTheLL list = new deleteMiddleOfTheLL();
        Scanner sc = new Scanner(System.in);
        String[] str = new String[1000];
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
            list.AddLL(str[i]);
        }
        list.printLL();
        System.out.println(list.getlen());
        list.middle();
        list.deleteMiddle();
        list.printLL();
    }
}
