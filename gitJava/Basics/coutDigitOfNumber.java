import java.util.*;
// import java.util.Scanner;

public class coutDigitOfNumber {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.println("Your Number is: " + n);
        int sum = 0;
        while(n != 0)
        {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n/10; 
        } 
        System.out.println("Reverse of this num is: " + sum);

    }
    
}
