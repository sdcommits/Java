import java.util.*;

public class stack_framework {
    public static void main(String args[]){
        Stack<Integer> s= new Stack<>();
        s.push(4);
        s.push(1); 
        s.push(6);
        s.push(8); 
        s.push(3);
        s.push(5); 
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }


    
}
