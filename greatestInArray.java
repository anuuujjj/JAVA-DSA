// import java.util.Scanner;

// public class greatestInArray{
//     public static void main(){

//         int arr[] = new int[5];
//             int n= arr.length;
//         Scanner sc = new Scanner(System.in);
//         for(int i=0;i<n;i++){
//             arr[i]= sc.nextInt();
//         }
//             int great=arr[0];
//         for(int i=0;i<n;i++){
//             if(arr[i]>great){
//                 great=arr[i];
//             }
//         }
//         System.out.println("Greatest among the following is:" + great);
//     }
    
// }
   


//minimumm

import java.util.Scanner;

public class greatestInArray{
    public static void main(){

        int []arr = new int[5];
            int n= arr.length;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
            int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Greatest among the following is:" + min);
        sc.close();
    }
    
}