import java.util.Scanner;

public class binary_tri {
    public static void main(String args[]){
        System.out.print("Enter the num: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<=n;i++){
          for(int j =0;j<=i;j++){
            int sum = i+j;
            if(sum %2 == 0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
          }
          System.out.println();


        }



    }
    
}
