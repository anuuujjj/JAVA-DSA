import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args){
        System.out.println("Enter number of rows:");
Scanner sc= new Scanner(System.in);
        int row= sc.nextInt();
        int [][]arr= new int[row][];
        
        
        for(int i=0;i<row;i++){

            
             System.out.println("Enter number of col for row:" + i);
             int col= sc.nextInt();
             arr[i]= new int[col];
            for(int j=0;j<col;j++){

                arr[i][j]= sc.nextInt();
            }
        }
sc.close();
//         int[][]arr = {{1,2,3,4,5},
//     {6,7,8,9,10},
// {11,12,13,14,15},
// {16,17,18,19,20}};
System.out.println("Output");
        for(int i=0;i<row;i++){
            int colLen=arr[i].length;
            for(int j=0;j<colLen;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
}
