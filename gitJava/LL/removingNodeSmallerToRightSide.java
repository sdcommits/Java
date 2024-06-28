// You are given the head of a linked list. Remove every node which has a node with a greater value anywhere to the right side of it. Return the head of the modified linked list.

import java.util.*;

public class removingNodeSmallerToRightSide {

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
        Node curNode = head;
        if(head == null){
            System.out.println("Empty");
            return;
        }
        while(curNode != null){
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    public int len(){
        if(head == null){
            return 0;
        }
        int l = 0;
        Node curNode = head;
        while(curNode != null){
            l++;
            curNode = curNode.next;    
        }
        return l;
    }

    public void removeEle(){
        if(head == null){
            return;
        }
        int l = len();
        int[] arr = new int[l];
        Node curNode = head;
        int i = 0;
        while(curNode != null){
            arr[i] = curNode.data;
            curNode = curNode.next;
        }

       Stack <Integer> s = new Stack<>();
       Node temp = head;
   }

    public static void main(String args[]){
        removingNodeSmallerToRightSide list = new removingNodeSmallerToRightSide();

        list.addLast(5);
        list.addLast(2);
        list.addLast(13);
        list.addLast(3);
        list.addLast(8);
        list.printLL();

        list.removeEle();
    }  
}
