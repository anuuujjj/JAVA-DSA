import java.util.Scanner;

public class maxValue2D_arary {
    public static void main(String[] args) {
         System.out.println("Enter the number of rows for your array:");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [][]arr = new int[n][];

       
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the number of columns in row"+ i);
            int col= sc.nextInt();
             arr[i]= new int[col];
            for(int j=0;j<col;j++){
                arr[i][j]= sc.nextInt();
            }
        }
sc.close();
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            
            int col=arr[i].length;
            for(int j=0;j<col;j++){
                if(arr[i][j]>max) max=arr[i][j];

                
        }

    }
    System.out.println("Maximum value :"+ max);
}
}