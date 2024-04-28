import java.util.*;

public class bubblySort {
    public static void print(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
// time complexity is the n^2
// space compexx is the O(1);


    public static void main(String args[]){
        int arr[] = {7,1,3,8,2};

        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);

    }
    
}
