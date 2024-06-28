import java.util.*;

public class pushAtEndInStack {

    public static void main (String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.print("Before adding: ");
        while(!s.isEmpty()){
            System.out.print(s.peek());
            s.pop();
        }
        // int n = 7;
        // n = s.get(s.size()+1);
        System.out.println("");
        System.out.print("After: ");
        while(!s.isEmpty()){
            System.out.print(s.peek());
            s.pop();
        }

        // for(int i=0;i<s.size();i++){
        //     System.out.println(s.get(i));
        // }


    }
    
}
