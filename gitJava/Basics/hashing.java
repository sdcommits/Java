import java.util.*;

public class hashing {
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(4);
        set.add(8);
        set.add(3);
        set.add(7);
        set.add(10);
        set.add(56);

        System.out.println(set);

        Iterator it = set.iterator();

        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        while(it.next() != null){
            System.out.println(set);
        }



    }    
}
