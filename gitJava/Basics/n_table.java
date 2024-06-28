import java.util.Scanner;

public class n_table {
    public static void main(String args[]){
        System.out.print("Enter the n: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for (int i =0 ; i<=10 ;i++){
           int  mul = i*n;
           System.out.println(mul);
        }

    }
    
}
