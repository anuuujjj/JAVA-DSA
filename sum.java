import java.util.*;

public class sum {
    //sum of a & b
    public static void main(String[] args) {
        float a,b;
        System.out.print("Enter your first number :");
        Scanner sc = new Scanner(System.in);
        a= sc.nextFloat();
        System.out.print("Enter your second number : ");
        b= sc.nextFloat();
        float sum = a+b;
        System.out.print("The required sum is : ");
        System.out.println(sum);
        sc.close();
    }
}
