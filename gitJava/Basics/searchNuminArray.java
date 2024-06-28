import java.util.Scanner;
public class searchNuminArray {

    public static void main(String args[]){
        System.out.print("Enter the size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

        for (int i =1 ; i<size; i++ ){
            num[i] = sc.nextInt();
        }
        for (int i =0 ; i<size; i++ ){
           System.out.print(num[i]);
        }
        System.out.println("Enter the search: ");
        int search = sc.nextInt();
    
        for (int i =0 ; i<size; i++ ){
            if (num[i] == search){
                System.out.println(i);
                break;
            }
            // else {
            //     System.out.println("Not found");
            // }
           
        }

    }
    
}
