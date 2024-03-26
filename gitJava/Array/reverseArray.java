
import java.util.*;

public class reverseArray {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size: ");
        n = sc.nextInt();
        
        int[] array =  new int[10];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Array elements are: ");
        for(int i=0;i<n;i++){
            System.out.print(array[i] + " ");
        } 
        
        System.out.println("Reverse Array: ");
        for(int i=n-1;i>=0;i--){
            System.out.print(array[i] +" ");
        }
    }
}

    // ArrayList<Integer> a1 = new ArrayList<>();