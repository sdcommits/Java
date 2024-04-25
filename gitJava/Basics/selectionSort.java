public class selectionSort {

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[] = {7,1,3,8,2};

        for (int i=0;i<arr.length;i++){
            int small = i;
            for(int j =i+1;j<arr.length ;j++){
                if(arr[small]>arr[j]){
                    small = j;
                    // arr[small] = arr[j];
                }
            }
            int temp = arr[small];
           arr[small] = arr[i] ;
            arr[i] = temp;
        }
        print(arr);
    }
    
}
