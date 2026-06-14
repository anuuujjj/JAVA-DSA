import java.util.Scanner;

public class productFunction {

    public static int Product(int a,int b){
       
        return a*b;
    }
    public static void main(String[] args) {
        
Scanner sc= new Scanner(System.in);
int a= sc.nextInt();
int b= sc.nextInt();

int pro= Product(a,b);
System.out.print("Product of "+a+" and "+b+" is "+pro);

sc.close();
    }
}
