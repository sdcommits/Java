import java.util.*;
public class addingTwoNumber {

    public static void
     res(int n){
        int s = 0;
        while(n> 0){
            int r = n%10;
            s = s*10+r;
            n = n/10;      
        }
        System.out.println(s);
    } 
    public static void main(String args[]){
        int[] arr = new int[1000];
        int[] brr = new int[1000];

        int n;
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entr the size: ");
        n = sc.nextInt();
        m = sc.nextInt();

        System.out.println("A ele: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("B ele: ");
        for(int i =0;i<m;i++){
            brr[i] = sc.nextInt();
        }

        String s = "0";
        String t = "0";

        for(int i = n-1;i>=0;i--){
            s = s + arr[i];
        }
        for(int i = m-1;i>=0;i--){
            t = t+brr[i];
        }

        int num = Integer.valueOf(s);
        int mum = Integer.valueOf(t);
        int out = num + mum;

        res(out);

        // System.out.println(out);
    }   
}
