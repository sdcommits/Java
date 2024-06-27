import java.util.*;

public class hashMap {
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India",120);
        map.put("US",30);
        map.put("japan",180);
        // System.out.println(map);

        map.put("India",130);
        map.put("LA",40);
        System.out.println(map);
        if(map.containsKey("India")){
            System.out.println("Present");   
        }else{
            System.out.println("Not present");
        }

        System.out.println(map.get("India"));
        System.out.println(map.get("noida"));


        // for array
        int arr[] = {1,2,3,4,5,6};
        System.out.println();
        for(int val : arr ){
            System.out.print(val+ " ");
        }

        for(Map.Entry<String,Integer>e : map.entrySet()){
            System.out.println(e.getKey() + e.getValue());              
        }



         
    }
    
    
}
