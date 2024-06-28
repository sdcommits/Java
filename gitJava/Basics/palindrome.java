import java.util.*;

public class palindrome {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt() ;
        int sum =0;
        int temp = n;
        while(n!=0){
            int rem = n%10;
            sum = sum*10+rem;
            n = n/10;
        }
        if(sum == temp){
            System.out.println("Yes it is a palindrome.");
        }
        else{
            System.out.println("No it is not a palindrome.");
        }

    }
}
