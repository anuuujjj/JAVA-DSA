// for each loop
// public class ARRAY{
// public static void main(String[] args){

//     int arr[];
//     arr= new int[5];
//     int brr[] ={1,3,4};
//     for(int val: brr){
//       System.out.println(val);
      
// }

// }}

import java.util.Scanner;

public class ARRAY {

    public static void main(String[] args) {
        int arr[]= new int[5];
        int n = arr.length;
        Scanner sc= new Scanner(System.in);
        // int a= sc.nextInt();
       for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();

       }
int sum=1;
       for( int val: arr){
        sum*=val;
       }
 System.out.println(sum);

sc.close();
    }
}