import java.util.Scanner;

public class num_sum {
    public static void main(String args[]){
        
        System.out.println("Enetre the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;   
        int i = 1;
        int sum = 0;
        for (i = 1;i<=n;i++){
        sum = sum + i;  
    } 
    System.out.println(sum);
}
}
