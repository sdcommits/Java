
import java.util.*;

public class sortArray {
   public static void main(String args[]){
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size:");
    n = sc.nextInt();

    int[] arr = new int[10];

    System.out.println("Enter the elements: ");
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int temp;

    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]<arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    System.out.println("Sorted Array: ");
    for(int i=0;i<n;i++){
        System.out.print(arr[i] +" ");
    }
   }
    
}












// import java.util.*;


// public class Solution {
//     public static void main(String[] args) {
//         int n;
//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();
//         int[] arr = new int[10000];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();     
//         }
//         int[] brr = new int[10000];
//         int i,j;
        
//         for(i=0;i<n;i++){
//             for( j=i+1;j<n;j++){
//                 if(arr[i] == arr[j]){
//                     if(i-j > 0){
//                         brr[i] = i-j;
//                     }
//                     if(i-j<0){
//                         brr[i] = (i-j)*-1;
//                     }   
//                 }
//             }
//         }
//         int sum = 0;
//         int min = brr[0];
        
//         for(i=0;i<n;i++){
//             sum = brr[i] + sum;    
//         }
        
//         for(i=0;i<n;i++){
//             if(brr[i]!=0 && brr[i]<=min){
//                 min = brr[i];
//             }
//         }
//         if(sum == 0){
//             System.out.println(-1);
//         }
//         else{
//             System.out.println(min);
//         }
   
        
//     }
// }

