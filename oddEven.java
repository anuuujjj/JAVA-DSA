import java.util.Scanner;

public class oddEven {
    public static void main(String[] args){
        System.out.print("Enter your number: ");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
         if(num%2==0){
            System.out.println("Number is even");

         }
         else{
            System.out.println("Number is odd.");
         }sc.close();
    }
}
