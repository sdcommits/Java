package Hash;
import java.util.*;

public class hashIntro {

    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();

        set.add(3);
        set.add(8);
        set.add(1);
        set.add(8);
        System.out.println(set);

        if(set.contains(8)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        System.out.println("Size of the set is: " + set.size());

        set.remove(1);
        System.out.println(set);

        //Iterator 
        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }  
}
