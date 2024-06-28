import java.util.*;

public class sumOfArrayNums {

    public static void main(String args[]){
        int[] arr = new int[100];
        int[] brr = new int[100];

        int n, m;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size: ");

        n = sc.nextInt();
        m = sc.nextInt();

        System.out.println("Enter the array: ");

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Next array");
        for(int i =0;i<m;i++){
            brr[i] = sc.nextInt();
        }

        int sum = 0;
        int a = 0;
        int b = 0, out = 0;;
        int i =0, j = 0;

        while(i<n && j<m){
            sum = arr[i] + brr[j];
            if(sum > 10){
                out = sum %10;
            }
            i++; j++;
            break;
        }

        

        System.out.println("Sum: " + sum +" "+a +" "+b+" "+ out);

    }
    
}
