import java.util.ArrayList;

class ArrayLists {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(3);
        list.add(5);
        list.add(1);
        list.add(7);
         
        System.out.println(list);

        // get elements
        System.out.println(list.get(2));

        // add elements (index,element)
        list.add(1,8);
        System.out.println(list);


        // set elements
        list.set(0,6);
        System.out.println(list);

        // delete element
        list.remove(1);
        System.out.println(list );

        // size of array
        int size = list.size();
        System.out.println(size);


    }  
}
 


// public class arrayintro {
    
// }
