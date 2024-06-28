import java.util.*;

public class reverseLinkeList {
    public static void main(String args[]){
        LinkedList <Integer> l1 = new LinkedList<Integer>();
        l1.add(3);
        l1.add(4);
        l1.add(8);
        l1.add(5);
        l1.add(7);
        int n = l1.size();
        System.out.println("size: "+n);
        // for(int i=0;i<l1.size();i++){
        //     System.out.println(l1.get(i));
        // }
        for(int i=1;i>0;i++){
            System.out.println(l1.get(n-i));

        }
    }
    
}
