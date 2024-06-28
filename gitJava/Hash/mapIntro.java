package Hash;
import java.util.*;

public class mapIntro {
    public static void main(String args[]){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Sheenam",10);
        map.put("Yash",20);
        map.put("Aman",5);
        map.put("Ashi",3);

        System.out.println(map);
        // if(map.containsKey("Sheenam")){
        //     System.out.println(true);
        // }
        // else{
        //     System.out.println(false);
        // }

        // System.out.println(map.get("Aman"));

        // map iterator

        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.print(e.getValue() + " " + e.getKey());
            System.out.println(" ");

        }
    }
    
}
