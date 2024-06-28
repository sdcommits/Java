import java.util.*;

public class stackClassArray {

    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
           return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);

        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }

            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }

    }

     public static void main(String args[]){
        Stack l = new Stack();
        l.push(1);
        l.push(4);
        l.push(3);
        l.push(7);
        l.push(5);

        while(!l.isEmpty()){
            System.out.println(l.peek());
            l.pop();
        }
           

        }
    
}
