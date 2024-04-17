package Hash;

import java.util.*;

public class mergingTwoMap {

    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();

        map.put("sheenam",40);
        map.put("vishal",30);
        map.put("rohan", 20);
        map.put("priya",10);
        map.put("ram",50);
        System.out.println(map);
        System.out.println(map.size());
        HashMap<String, Integer> mapee = new HashMap<>();
        mapee.putAll(map);
        mapee.put("kavi", 30);
        mapee.put("ravin", 80);
        System.out.println(mapee);
    }  
}
