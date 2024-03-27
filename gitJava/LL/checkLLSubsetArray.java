// WRONG METHOD----------->>> USE HASH SET
// WRONG METHOD----------->>> USE HASH SET
// WRONG METHOD----------->>> USE HASH SET
// WRONG METHOD----------->>> USE HASH SET



import java.util.*;

public class checkLLSubsetArray {

    static Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addlast(int data){
        Node newNode = new Node(data);
        Node curNode = head;
        if(head == null){
            head = newNode;
            return ;
        }
        while(curNode.next != null){
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
        System.out.print("NULL");
    }

    public int checkSubeset(Node head, int[] arr){
        Stack<Integer> stack = new Stack<>();
        int i =0;
        for(i =0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        int out = 0;
        Node curNode = head;
        while(curNode!= null){
            int p = stack.pop();
            if(curNode.data != p){
                out = curNode.data;
            }
            curNode = curNode.next;
        }
        return out;

    }
    public static void main(String args[]){

        int arr[] = {1,3,4,5};
        checkLLSubsetArray list = new checkLLSubsetArray();
        list.addlast(1);
        list.addlast(2);
        list.addlast(3);
        list.addlast(4);
        list.addlast(5);
        list.printLL();
        System.out.println(list.checkSubeset(head, arr));
    } 
}
