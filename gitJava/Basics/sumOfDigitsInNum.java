import java.util.Scanner;

public class sumOfDigitsInNum {

    public static void main(String args[]){
        System.out.println("Enter the num: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int sum =0 ;
        int count =0;
        while(n != 0){
            int rem = n%10;
            // rev = rev*10+rem;
            // sum = sum + rem;
            count++;
            n = n/10;
            
            
        }
        System.out.println(count);

    }
    
}
