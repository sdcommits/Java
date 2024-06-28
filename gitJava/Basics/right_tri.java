import java.util.Scanner;

public class right_tri {
    public static void main(String args[]){
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for (int i =0 ;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        
    }
    
}
