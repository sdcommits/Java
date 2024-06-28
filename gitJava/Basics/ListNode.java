import java.util.*;


class Solution{
    public ListNode remove(ListNode head,int n){
        if(head.next == null){
            return null;
        }

        // size

        int size = 0;
        ListNode curr = head;
        while (curr !=null){
            curr = curr.next;
            size++;
        }

        if(n==size){
            return head.next;
        }

        int indexSearch = size - n;
        ListNode prev = head;
        int i=1;
        while(i<indexSearch){
            prev = prev.next; 
            i++;
        }
        prev.next = prev.next.next;
        return head;



    }


}

public class ListNode {

    int val;
    ListNode next;
    ListNode(){}
        ListNode(int val) {this.val = val;}
        ListNode(int val,ListNode next ){this.val = val;this.next = next;}
    

    public static void main(String args []){
        LinkedList <Integer> l1 = new LinkedList<>();
        int num,index,i ;
        l1.add(3);
        l1.add(4);
        l1.add(8);
        l1.add(5);
        l1.add(7);
        int n = l1.size();
        System.out.println("size: "+n);
        index = 2;
        num = n-index;   
        for(i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
            num = i;
            System.out.println("element: ");
            System.out.println(l1.get(i));
        }
    }
    
}
