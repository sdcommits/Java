package Hash;
import java.util.*;

public class addingKeyIfAbsent {
    public static void main(String args[]){

        HashMap<String, Integer> map = new HashMap<>();

        map.put("sheenam",40);
        map.put("vishal",30);
        map.put("rohan", 20);
        map.put("priya",10);
        map.put("ram",50);
        System.out.println(map);
        System.out.println(map.size());

        map.putIfAbsent("sheenam", 30);
        map.putIfAbsent("Nav", 50);
        System.out.println(map);
    }
    
}
