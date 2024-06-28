import java.util.*;

class implementLL {

    public static void main(String args[]){
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(15);
        l1.add(3);
        l1.add(8);
        l1.add(7);
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+"->");
        }
        System.out.println(l1.contains(15));
        System.out.println(l1.indexOf(8));
       
        
    }

    
}
