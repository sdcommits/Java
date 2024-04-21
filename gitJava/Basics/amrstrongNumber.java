import java.util.*;

public class amrstrongNumber {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = n;
        int sum =0;
        while(n!=0){
            int rem = n%10;
            sum = sum+rem*rem*rem;
            n = n/10;
        }
        if(sum == temp){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
    
}
