import java.util.Scanner;

public class functionAdd {
    public static int CalculateSum(int a,int b){
        int sum= a+b;
        return sum;
    }
    public static void main(String[] args) {
        

        Scanner sc= new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();

    int summ= CalculateSum(a,b);
System.out.println("Sum of "+ a + " and " + b +" is " + summ);
sc.close();
    }
}
