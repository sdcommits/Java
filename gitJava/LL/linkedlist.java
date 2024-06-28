import java.util.*;

public class linkedlist {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list  = new LinkedList<>();
        list.addFirst("Sheenam");
        list.addFirst("The");
        list.addLast("Dubey");
        System.out.print(list);

        list.removeFirst();
        System.out.print(list);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) +"->");   
        }
        System.out.print("NULL");
    }
    
    
}
