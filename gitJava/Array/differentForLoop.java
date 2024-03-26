import java.util.*;

public class differentForLoop {
    public static void main(String args[]){
        int[] arr = {12,45,23,67};

        for(int i=0;i<4;i++){
            System.out.print(arr[i] + " ");
        }
        System.err.println(" ");
        for(int val : arr){
            System.out.print(val + " ");
        }

    }
    
}
