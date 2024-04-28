import java.util.Scanner;

public class bubbleSort {

    public static void main(String args[]){
        System.out.println("Enter the num: ");
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int j ;
        int[] arr = new int[5] ;
        for(int i=0;i<arr.length;i++){
           arr[i] = sc.nextInt();
        }
        // System.out.println("Given array is: ");
        //  for(int i=0;i<n;i++){
        //    System.out.println(arr[i]);
        // }

        for (int i =0 ; i<arr.length-1; i++){
            for(j = 0 ; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                }

            }
        }
        for(int i=0;i<arr.length;i++){
        //    arr[i] = sc.nextInt();
           System.out.println(arr);
        }
    }
    
}
